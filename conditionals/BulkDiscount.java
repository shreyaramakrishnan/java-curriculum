public class BulkDiscount {
    public static void main(String[] args) {
        boolean check1 = bulkDiscount("pencils", 1.0, 500);
        System.out.println("discount applied? " + check1);
        
        boolean check2 = bulkDiscount("erasers", 0.25, 1000);
        System.out.println("discount applied? " + check2);

        boolean check3 = bulkDiscount("notebooks", 3.0, 100);
        System.out.println("discount applied? " + check3);

        boolean check4 = bulkDiscount("backpacks", 20.0, 150);
        System.out.println("discount applied? " + check4);

    }

    /* TODO */
    // implement the bulkDiscount() method to perform the following behavior:

    // the method should report the product order and quantity
    // it should also calculate and report the total cost for the order
    // a bulk discount of 10% is applied if the total cost is at least $500 
    // the method should return whether or not the discount was applied to the order

    public static boolean bulkDiscount(String product, double unitPrice, int quantity) { 
        
        
    }

}