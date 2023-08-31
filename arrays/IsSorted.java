package arrays;

public class IsSorted {
    public static void main(String[] args) {
        double[] arr1 = {16.1, 12.3, 22.2, 14.4};
        double[] arr2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2}; 
        double[] arr3 = {-2.3};
        double[] arr4 = {-5.2, -2.1, 1.0, -1.3, 4.5, -7.0};
        isSorted(arr1);
        isSorted(arr2);    
        isSorted(arr3);
        isSorted(arr4);    
    }

    private static char[] isSorted(double[] arr) {
     for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                double temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
     }         
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return null;
    }
}
