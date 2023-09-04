package arrays;
import java.util.*;
public class CopyRange {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {91, 92, 93, 94, 95, 96};
        copyRange(a1, a2, 0, 2, 3);

        System.out.println(Arrays.toString(a2));
    }

    // TODO: write the static method copyRange

    /* Write a static method named copyRange that takes 
    as parameters two arrays a1 and a2, two starting indexes 
    i1 and i2, and a length l, and copies the first l elements 
    of a1 starting at index i1 into array a2 starting at index i2
    */
}