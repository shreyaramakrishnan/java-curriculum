import java.util.*;
public class EvenSumMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
    }

    /* TODO */
    // implement the evenSumMax() method to perform the following behavior:

    // repeatedly prompt the user to type integers and to enter -1 to quit 
    // the method should sum all of the user-entered values that are even 
    // and should keep track of the greatest even value entered 

    // should report the even sum and the even max once -1 is entered

    public static void evenSumMax(Scanner scan) { 
        int val = -2;
        int evenSum = 0; 
        int evenMax = 0;
        while (val != -1) {
            System.out.print("next integer (type -1 to quit): ");
            val = scan.nextInt();
            if (val % 2 == 0) { 
                evenSum += val;
                if (val > evenMax) { 
                    evenMax = val;
                }
            }
        }
        System.out.println("even sum = " + evenSum);
        System.out.println("even max = " + evenMax);
    }
}