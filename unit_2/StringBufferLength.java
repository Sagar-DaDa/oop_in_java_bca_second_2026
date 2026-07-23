import java.io.*;

public class StringBufferLength {
    public static void main(String[] args) {

        // Creating and storing string by creating object of StringBuffer
        StringBuffer s = new StringBuffer("Birat Kshitiz College");

        // Getting the length of the string
        int p = s.length();

        // Getting the capacity of the string
        System.out.println("Length of string Birat Kshitiz College=" + p); //21
    }    
}


