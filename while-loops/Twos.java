public class Twos{
    public static void main(String[] args){
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }
    
    /* TODO */
    // implement the showTwos() method to perform the following behavior:

    // express the int parameter value as a factor of 2's and an odd factor
    public static void showTwos(int value) { 
        System.out.print(value + " = ");
        while (value % 2 == 0) {
            value = value/2 ;
            System.out.print("2 * ");

        }
        System.out.println(value); 
    }
}