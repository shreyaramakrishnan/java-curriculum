import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        vendDrink(console);
    }

/*
 * Write a method called vendDrink() that simulates the display behind a vending machine. 
 * When the method is called, the user should be prompted to enter a choice for a drink. 
 * If the user enters 1, Pouring water! should be printed. Otherwise, if the user enters 2, 
 * Dispensing soda! should be printed. Similarly, if the user enters 3, Squeezing fresh juice! 
 * should be printed. Finally, if the user enters in another number that is not 1, 2, or 3, 
 * (e.g., 27), then Invalid choice! should be printed.
 */

    public static void vendDrink(Scanner scan) { 
        System.out.println("What would you like to drink?");
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("Pouring Water!");
        } else if (num == 2) {
            System.out.println("Dispensing Soda!");
        } else if (num == 3) {
            System.out.println("Squeezing fresh juice!");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}