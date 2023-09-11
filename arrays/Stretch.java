package arrays;

import java.util.*;
public class Stretch {
    public static void main(String[] args) {
        int[] arr = new int[]{18, 7, 4, 24, 11};
        arr = stretch(arr);
        System.out.println(Arrays.toString(arr));
    }

    // TODO: Your Code Here. Write a method called
    // stretch for this problem 

    /*
     * Write a static method named stretch that accepts an 
     * array of integers as a parameter and returns a new 
     * array twice as large as the original, replacing every 
     * integer from the original array with a pair of integers,
     *  each half the original. If a number in the original 
     * array is odd, then the first number in the new pair should 
     * be one higher than the second so that the sum equals the 
     * original number.
     */

    public static int[] stretch(int[] arr) {
        int i2 = 0;
        int[] arr2 = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                arr2[i2] = arr[i]/2;
                arr2[i2+1] = arr[i]/2;
            } else {
                arr2[i2] = arr[i]/2 +1;
                arr2[i2+1] = arr[i]/2;
            }
            i2+=2;
        }
        return arr2;
    }
}