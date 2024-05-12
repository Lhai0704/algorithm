import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        String temp = "";
        int i = 0;

        while (!StdIn.isEmpty()) {
            i++;
            temp = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = temp;
            }

        }

        StdOut.println(champion);


    }
}
