interface Printer<T> {
    void print(T value);
}

class GenericInterfaceDemo implements Printer<Integer> {

    public void print(Integer value) {
        System.out.println("Integer: " + value);
    }
}

class StringPrinter implements Printer<String> {

    public void print(String value) {
        System.out.println("String: " + value);
    }
}

public class GenericInterfaceExample {

    public static void main(String[] args) {

        GenericInterfaceDemo ip = new GenericInterfaceDemo();
        ip.print(100);

        StringPrinter sp = new StringPrinter();
        sp.print("Hello Java");
    }
}
