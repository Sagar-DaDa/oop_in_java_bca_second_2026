package bytestream;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException{

        FileInputStream in = null;        
        
        try {
            in = new FileInputStream("bytestream/in_data.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }finally {
            if (in != null)
                in.close();
        }
    }
}