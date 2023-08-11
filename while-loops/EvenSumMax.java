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
        System.out.println("Type any integer.");
        int sum = 0;
        int max = 0;
        int num = scan.nextInt();
        while (num != -1) {
            if (num % 2 == 0) {
                sum = num + sum;
                if (num > max) {
                    max = num;
                }
            }
            num = scan.nextInt();
        } 
        System.out.println("Even sum = " + sum);
        System.out.println("Even max = " + max);
    }
}