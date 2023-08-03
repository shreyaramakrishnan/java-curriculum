public class Fibonacci {
    public static void main(String[] args) {
        /* TODO */
        // Write a for loop that prints out n numbers of the fibonacci sequence
        int n = 12; 
        /* for loop (start at 0, go until some number, declare sum variable outside, )
         * 
         */

        // 0 1 1 2 3 5 8 13 21 34 55 89 144

        // first index = 0 
        // second index = 1
        // all others = prev sum
       
        int num1 = 0; 
        int num2 = 1;
        System.out.println(num1);
        System.out.println(", " + num2);
        for (int i = 0; i < n; i++) {
            // print the sum of the previous two numbers
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(", " + sum);
        }
    }
}