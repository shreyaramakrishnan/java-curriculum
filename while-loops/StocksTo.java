import java.util.*;


public class StocksTo {
    public static void main(String[] args) {
        Random r = new Random(42);
        int totalDays = stocksTo(r, 15);
        System.out.println("Total days: " + totalDays);
    }

/*
 * Implement a method named stocksTo() that, given a Random and an integer max, simulates a 
 * hypothetical run of days in the 121 stock market. In the 121 stock market, each day a 
 * randomly generated amount of money is earned, between 1 and 6 dollars, inclusive. The 
 * likelihood of generating each amount of money is the same. 
 */

    public static int stocksTo(Random r, int max) {
        int total = 0;
        int days = 0;
         while (total < max) {
            int money = r.nextInt(6) + 1;
            total += money;
            days += 1;
            System.out.println("This is how much I earned on day " + days + ": " + money);
        }
        return days; 

        // keep track of total money
        // keep track of days
        // while total < max 
            // get random int 
            // add to the sum 
            // add to the days
        // return days
    }
}