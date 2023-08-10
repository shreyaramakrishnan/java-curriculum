public class Addition {
    // main method 
    public static void main(String args[]) {
        // add two numbers
        int sum1 = add(5, 7);
        // then divide them by 2 to get the average 
        int avg1 = average(sum1, 2);
        // do that with 3 sets of numbers 
        // 2,3 + 4,8
        int sum2 = add(2, 3);
        int avg2 = average(sum2, 2);
        int sum3 = add(4, 8);
        int avg3 = average(sum3, 2);
        // get the average of all 3 sets of numbers 
        int avg_sum = add(avg1, avg2);
        avg_sum = add(avg_sum, avg3);
        int supreme_avg = average(avg_sum, 3);
        System.out.println("The average of all 3 sets of numbers is " + supreme_avg);
    }

    // method to add two numbers 
    public static int add(int num1, int num2) {
        // return the sum of the two numbers
        return num1 + num2;
    }

    // method to calculate an average based on the sum
    public static int average(int sum, int buckets) {
        // return the average of the two numbers
        return sum / buckets;
    }
}