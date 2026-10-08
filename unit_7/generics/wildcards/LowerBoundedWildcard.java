import java.util.ArrayList;

public class LowerBoundedWildcard {

    public static void addNumbers(
            ArrayList<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        addNumbers(numbers);

        System.out.println(numbers);
    }
}
