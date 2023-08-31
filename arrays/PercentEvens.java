package arrays;

import java.util.*;

public class PercentEvens {
    public static void main(String[] args) {
        int[] arrayA = {6, 2, 9, 11, 3};
        percentEvens(arrayA);

        int[] arrayB = {-1, 3, 9, 11, 13};
        percentEvens(arrayB);
    }

    private static void percentEvens(int[] arr) {
        double numberCount = 0;
        int countEvens = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            numberCount = numberCount + 1;
            if (number%2 == 0) {
                countEvens = countEvens + 1;
                
            }
            
        }
        
    double evenPercent = (countEvens/numberCount);
    System.out.println("The amount of evens are " + countEvens + "."); 
    System.out.println("The percent of all evens are " + evenPercent + "." );    
    }
}