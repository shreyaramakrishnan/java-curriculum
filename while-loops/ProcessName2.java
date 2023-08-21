import java.util.*;  // for Scanner

public class ProcessName2 {

    /*
     * Modify the code so that it re-prompts until the user types a name that 
     * is at least 5 letters total in length and has at least one space in it.
     */
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Please input a name: ");
            String name = console.nextLine();
            while (name.length() < 5 || !name.contains(" ")) {
                System.out.print("Your name is invalid, please input another name: ");
                name = console.nextLine();
            }
            System.out.println("Your name is " + name);
            // grab the name first outside
            // while name.length < 5 and name does not contain a space 
                // ask the user for a name 
            //print name  
        }
    }
}