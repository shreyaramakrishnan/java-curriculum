public class AsciiArt {
    public static void main(String[] args) {
        /* TODO */
       /*  $$$
            $$$
            $$$
            $$$

            ############
            ############
            ############

            ******
            ******
            ******
            ******
            ******
            ******
        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 12; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}