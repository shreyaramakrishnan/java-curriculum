public class Fibonacci {
    public static void main(String[] args) {
        /* TODO */
        // Write a for loop that prints out n numbers of the fibonacci sequence
        int n = 12; 
        /* for loop (start at 0, go until some number, declare sum variable outside, )
         * 
         */
        int firstOne = 1;
        int secondOne = 1;
        System.out.println(firstOne);
        System.out.println(secondOne);
        int count = 0;
        for (int i = 0; i <= 12; i++ ) {
            count = (firstOne + secondOne);
           firstOne = (secondOne);
           secondOne = count;

            System.out.println(count);
        }
       

    }
}