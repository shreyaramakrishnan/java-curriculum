import java.util.*;
import java.io.*;

// Write a static method evenNumbers that accepts a Scanner as a parameter reading 
// input from a file with a series of integers, and report statistics about the 
// integers to the console. Report the total number of numbers, their sum, the 
// count of even numbers, and the percent of even numbers.

public class EvenNumbers{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("numbers.txt"));
        evenNumbers(input);
    }

    // Your code here -> Write a method called
    // EvenNumbers for this problem

    // use to round values to two decimal places
    public static double round2(double num) {
        return Math.round(num * 100.0) / 100.0;
    }
}