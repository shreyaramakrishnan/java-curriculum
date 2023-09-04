package arrays;

import java.util.*;
public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 19, 7};
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
    }


    /* 
     * Write a static method named rotateLeft that accepts an 
     * array of integers as a parameter and rotates the values 
     * in the array to the left (i.e., backward in position) by 
     * one. Each element moves left by one, except the first 
     * element, which moves to the back.
     */

    public static void rotateLeft(int[] arr) { 
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
            
        }
        arr[arr.length-1] = first;
    }
}