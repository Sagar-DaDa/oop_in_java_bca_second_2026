import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomFileWriteExample {
    public static void main(String[] args) throws IOException {

        RandomAccessFile file = new RandomAccessFile("data.txt", "rw");

        file.seek(5);
        file.write('X');

        file.close();
    }
}
