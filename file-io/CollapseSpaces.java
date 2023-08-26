import java.util.*;
import java.io.*;

// Write a static method collapseSpaces that accepts a Scanner for an input file as
// its parameter, then reads that file and outputs it with all tokens separated by 
// single spaces, collapsing any sequence of multiple spaces into a single space.

public class CollapseSpaces{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner fileScan = new Scanner(new File("/Users/srithikabarakam/java-curriculum/file-io/input.txt"));
        collapseSpaces(fileScan);
    }

    public static void collapseSpaces(Scanner fileScan) throws NoSuchElementException{
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                System.out.print(word + " " );
            }
            System.out.println();
        }
    }

    // Your code here -> Write a method called
    // collapseSpaces() here
}