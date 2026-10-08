package characterstream;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("characterstream/in_data.txt");
            out = new FileWriter("characterstream/out_data.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("File copied!");
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}

