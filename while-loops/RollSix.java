import java.util.*;

public class RollSix {
    public static void main (String[] args) {
        Random r = new Random(10);
        rollSix(r);
    }

    /* TODO */
    // implement the rollSix() method to perform the following behavior:

    // report each roll of a six-sided die where the value ranges from 
    // 1 (inclusive) to 6 (inclusive)
    // the method should stop generating new values once a 6 is rolled
    // the program should report the amount of spins it took to reach a 6
    public static void rollSix(Random r) { 
        int count = 1;
        int i = r.nextInt(6) + 1;
        System.out.println("This is the random number that the computer has rolled; " + i);

        while (i != 6) {
            count = count + 1;
            i = r.nextInt(6) + 1 ;
            System.out.println("This is the random number that the computer has rolled; " + i);
        } 
        System.out.println("This is how many times it took to reach 6 on a random dice roll " + count);

        
    }
}