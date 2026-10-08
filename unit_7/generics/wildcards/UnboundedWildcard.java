import java.util.ArrayList;

public class UnboundedWildcard {

    public static void display(ArrayList<?> list) {

        for (Object value : list) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sita");
        names.add("Hari");

        display(numbers);
        display(names);
    }
}
