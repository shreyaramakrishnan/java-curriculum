/*
 * Given the name Jessie Pinkman, you want to turn it into Pinkman, J. 
 */
 
public class ProcessName {
    public static void main(String[] args) {
        String name = "John Doe";
        char firstInitial = name.charAt(0);
        int spaceIndex = name.indexOf(' ');
        String lastName = name.substring(spaceIndex + 1 );
        System.out.println(lastName + ", " + firstInitial + "." );
        
    
    }
}