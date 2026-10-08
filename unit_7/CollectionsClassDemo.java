import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Cat");
        al.add("Banana");
        al.add("Apple");

        Collections.sort(al); // Using Collections class

        System.out.println(al); // [Apple, Banana, Cat]
    }
}