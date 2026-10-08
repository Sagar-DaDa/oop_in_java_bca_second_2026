public class GenericMethod {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        display(100); // 100
        display("Hello"); // Hello
        display(25.5); // 25.5
        display(true); // true
    }
}
