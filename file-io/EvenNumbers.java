import java.util.*;
import java.io.*;

// Write a static method evenNumbers that accepts a Scanner as a parameter reading 
// input from a file with a series of integers, and report statistics about the 
// integers to the console. Report the total number of numbers, their sum, the 
// count of even numbers, and the percent of even numbers.

public class EvenNumbers{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("/Users/srithikabarakam/java-curriculum/file-io/numbers.txt"));
        evenNumbers(input);
    }

    // Your code here -> Write a method called
    // EvenNumbers for this problem

    // use to round values to two decimal places
    public static double round2(double num) {
        return Math.round(num * 100.0) / 100.0;

    }
    public static void evenNumbers(Scanner input) {
        float evenCount = 0;
        int sum = 0;
        int count = 0;
        while (input.hasNextInt()) {
            count = count + 1;
            int number = input.nextInt();
            sum = sum + number;
                if (number%2 == 0) {
                    evenCount = evenCount + 1; 
                    
                    
            }
        
            
        }
        float evenPercent = ((evenCount) / count);
        System.out.println("The total amount of numbers are " + count);
        System.out.println("The sum of all the numbers is " + sum);
        System.out.println("The total amount of even numbers are: " + evenCount);
        System.out.println("The percentage of the amount of even numbers are " + evenPercent + "%");

        

    }
}