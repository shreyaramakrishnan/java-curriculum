import java.util.*;
public class Smallest1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallest1(console);
    }

    /*
     * Write a static method named smallest1 that accepts a Scanner for 
     * console input as a parameter. The method repeatedly prompts the user 
     * for a sequence of integers until the user enters a negative number. 
     * The method then prints the smallest nonnegative numbers entered by 
     * the user. (You may assume the user will enter at least 1 nonnegative number). 
     */
    public static void smallest1(Scanner console) {
        System.out.print("Please enter a number: ");
        int number = console.nextInt();
        int min = number;
        while (number > 0) {
            if (min > number) {
                min = number;
            }
            System.out.println("Please enter another number.");
            number = console.nextInt();


            
        }
        System.out.println("The smallest nonnegative number entered was " + min );


        // ask user for number 
        // declare variable outside for min
        // while number != negative
        // if min > num 
        // min = num
        // 
    }
}