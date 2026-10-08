import java.util.ArrayList;

public class UpperBoundedWildcard {

    public static void display(ArrayList<? extends Number> list) {

        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        ArrayList<Double> decimals = new ArrayList<>();
        decimals.add(10.5);
        decimals.add(20.5);

        display(numbers);
        display(decimals);
    }
}
