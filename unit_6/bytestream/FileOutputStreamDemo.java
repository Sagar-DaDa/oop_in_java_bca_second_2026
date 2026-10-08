package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;

        try {
            String text = "Hello, this is just a test message!!!";
            out = new FileOutputStream("bytestream/out_data.txt");

            for(int i = 0; i<text.length(); i++){
                out.write(text.charAt(i));
            }
            System.out.println("Completed!");
        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        } finally {
            if (out != null) out.close();
        }
    }
}
