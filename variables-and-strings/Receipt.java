//  This program computes the total amount owed for a meal,
//  assuming 8% tax and a 15% tip. * reduce all redunancy 
public class Receipt {
	public static void main(String[] args) {
        double subTotal = ((38+40+30));
		System.out.println("Subtotal:");
        System.out.println(subTotal);
        System.out.println("Tax:");
        System.out.println(subTotal * .08);
        System.out.println("Tip:");
        System.out.println(subTotal * .15);
        System.out.println("Total:");
        System.out.println(subTotal +
                            subTotal * .08 +
                            subTotal * .15);
	}
}