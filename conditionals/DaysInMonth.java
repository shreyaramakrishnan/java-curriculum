package conditionals;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println(daysInMonth(1));
        System.out.println(daysInMonth(2));
        System.out.println(daysInMonth(3));
        System.out.println(daysInMonth(4));
        System.out.println(daysInMonth(5));
        System.out.println(daysInMonth(6));
        System.out.println(daysInMonth(7));
        System.out.println(daysInMonth(8));
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(11));
        System.out.println(daysInMonth(12));
        
    }

    /* TODO */
    // implement the daysInMonth() method to perform the following behavior:

    // based on whatever month is passed to the method as a parameter,
    // return either 28, 30, or 31
    public static int daysInMonth(int month) {
        if (month == 1 || month ==  3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31; 
        } else if (month == 2) {
            return 28;
        } else {
            return 30; 
        }
    } 
}