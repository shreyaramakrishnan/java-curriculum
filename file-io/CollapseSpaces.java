import java.util.*;
import java.io.*;

// Write a static method collapseSpaces that accepts a Scanner for an input file as
// its parameter, then reads that file and outputs it with all tokens separated by 
// single spaces, collapsing any sequence of multiple spaces into a single space.

public class CollapseSpaces{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner fileScan = new Scanner(new File("input.txt"));
        collapseSpaces(fileScan);
    }

    // Your code here -> Write a method called
    // collapseSpaces() here
}