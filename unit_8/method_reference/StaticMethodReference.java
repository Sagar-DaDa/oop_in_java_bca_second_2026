import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {

    public static void display(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        numbers.forEach(StaticMethodReference::display);
    }
}
