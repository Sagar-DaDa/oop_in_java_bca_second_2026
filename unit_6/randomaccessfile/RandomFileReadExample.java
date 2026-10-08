import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomFileReadExample {
    public static void main(String[] args) throws IOException {

        RandomAccessFile file =     new RandomAccessFile("data.txt", "r");

        file.seek(3);

        // int txtData = file.read();
        // System.out.println((char)txtData);

        byte[] data = new byte[4];
        file.read(data);

        System.out.println(new String(data));

        file.close();
    }
}