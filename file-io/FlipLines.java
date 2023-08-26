import java.io.*;
import java.util.*;

// Write a method named flipLines that accepts as its parameter a Scanner for an
// input file and that writes to the console the same file's contents with successive 
// pairs of lines reversed in order. 

public class FlipLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("/Users/srithikabarakam/java-curriculum/file-io/jabberwock.txt"));
        flipLines(fileScan);
    }

    /* TODO */
    // implement flipLines() below.
    public static void flipLines(Scanner fileScan) {
        while (fileScan.hasNextLine()) {
            String firstLine = fileScan.nextLine();
            if (fileScan.hasNextLine()) {
                String secondLine = fileScan.nextLine();
                System.out.println(secondLine);
                


            }
            System.out.println(firstLine);
        }
        


    }
    
}