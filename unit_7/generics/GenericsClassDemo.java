class Box<T>{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsClassDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Birat Kshitiz College");

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(404);

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());
    }
}
