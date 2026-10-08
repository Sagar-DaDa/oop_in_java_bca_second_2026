import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String name = null;

        Optional<String> optionalName =
                Optional.ofNullable(name);

        String result = optionalName.orElse("No Name");

        System.out.println(result);
    }
}
