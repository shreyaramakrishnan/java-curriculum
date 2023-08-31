package arrays;

import java.util.*;


/* 
 * Write a static method named fibonacci that accepts an array of integers 
 * as a parameter and completes the Fibonacci sequence. In the Fibonacci 
 * sequence, each number in the sequence is the sum of the two numbers that 
 * precede it.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr1 = {1, 1};
        fibonacci(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 1, 0, 0, 0, 0};
        fibonacci(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void fibonacci(int[] arr2) {
    }

}