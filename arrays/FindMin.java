package arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr1 = new int[]{16, 12, 25, 44};
        int[] arr2 = new int[]{1};
        int[] arr3 = new int[]{10, 5, -3, 4, 2};
        findMin(arr1);
        findMin(arr2);
        findMin(arr3);
    }

    // TODO: Your Code Here. Write a method called
    // findMin for this problem

    public static void findMin(int[] arr) { 
        int numberMin = arr[0]; 
        for (int i = 0; i < arr.length; i++ ) {
            if (numberMin > arr[i]) {
                numberMin = arr[i];
            }
        }
        System.out.println("The minimum of this array is: " + numberMin); 
    }
}
