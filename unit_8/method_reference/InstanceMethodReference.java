import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {

    public void display(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        InstanceMethodReference obj = new InstanceMethodReference();

        List<String> names =
                Arrays.asList("Ram", "Hari", "Sita");

        names.forEach(obj::display);
    }
}
