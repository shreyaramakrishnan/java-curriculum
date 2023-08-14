import java.util.*;

public class FavoriteLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        favoriteLetter(console, "y");
    }

    /*
     * Write a method named favoriteLetter that accepts two parameters: a Scanner for the
     *  console, and a favorite letter represented as a one-letter String. The method 
     * repeatedly prompts the user until a word that starts with that letter is entered. 
     * The method then prints a message showing the last word typed.
     * You may assume that the user will type a single-word response to each prompt. Your 
     * code should be case-sensitive; for example, if the favorite letter is a, you should 
     * not stop prompting if the user types words that start with an A. 
     */
    
    public static void favoriteLetter(Scanner console, String letter) { 
        System.out.print("Plesae enter your favorite letter: ");
        String input = console.next();
        System.out.print("Please enter a word: ");
        String word = console.next();
        while (!word.contains(input) && word.substring(0) != input) {
            System.out.print("Input is invalid, please enter another word: ");
            word = console.next();
        }
        System.out.println("Your entered word, " + word + ", starts with your favorite letter, " + input + ".");
    }
        
      

}
