import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Domino domino = new Domino(i, j);
                if (!pile.contains(domino)) {
                    pile.add(domino);
                }
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        ArrayList<Domino> newPile = new ArrayList<>(pile);
        pile.clear();

        while (!newPile.isEmpty()) {
            int randomIndex = random.nextInt(newPile.size());
            pile.add(newPile.remove(randomIndex));
        }
    }

    public void shuffleInPlace() {
        Random random = new Random();
        int n = pile.size();
        for (int i = 0; i < n * 10; i++) {
            int index1 = random.nextInt(n);
            int index2 = random.nextInt(n);
            Collections.swap(pile, index1, index2);
        }
    }
    public ArrayList<Domino> getPile() {
        return pile;
    }
}
