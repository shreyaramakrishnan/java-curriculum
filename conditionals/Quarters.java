public class Quarters {
    public static void main(String[] args) {
        System.out.println(quarters(2));
        System.out.println(quarters(12));
        System.out.println(quarters(9));
        System.out.println(quarters(4));
        System.out.println(quarters(7));
        System.out.println(quarters(1));
        System.out.println(quarters(6));
        System.out.println(quarters(8));
        System.out.println(quarters(11));
        System.out.println(quarters(5));
        System.out.println(quarters(3));
    }

    /* TODO */
    // implement the quarters() method to perform the following behavior:

    // if the month passed is between 1-3, return that it is in quarter 1
    // if the month passed is between 4-6, return that it is in quarter 2
    // if the month passed is between 7-9, return that it is in quarter 3
    // if the month passed is between 10-12, return that it is in quarter 4

    public static int quarters(int month) { 
        if (month == 1 || month == 2 || month == 3) {
            return 1; 
        } else if (month == 4 || month == 5 || month == 6) {
            return 2; 
        
        } else if (month == 7 || month == 8 || month == 9) {
            return 3;
        } else {
            return 4;
        }

        
    }

}