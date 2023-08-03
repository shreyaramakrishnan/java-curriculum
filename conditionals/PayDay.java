public class PayDay {
    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
        System.out.println(pay(10.00, 40));
        System.out.println(pay(0.25, 7));
        System.out.println(pay(0.00, 20));
        System.out.println(pay(9.00, 0));
    }

    /* TODO */
    // implement the pay() method to perform the following behavior:

    // return the total week's pay for a TA given their hourly pay rate 
    // and the amount of hours worked this week.
    // if their hours exceed 8 hours, they should be paid the overtime rate (multiple regular pay by 1.5)
    // for the hours past 8 hours 
    public static double pay(double rate, int hours) {
        if (hours > 8) {
            double regularPay = 8 * rate;
            int extraHours = hours - 8;
            double overtimePay = 1.5 * rate * extraHours;
            return regularPay + overtimePay;
        } else {
           return hours * rate; 

        }

        // found the regular pay by multiplying rate * 8 
        // if the hours > 8 
            // found the overtime rate 
            // found extra hours 
            // multiplied overtime rate * extra hours worked 
        // returned regular + overtime 
    }

    
}