class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

class NumberBox<T extends Number> extends Box<T> {

    void showDoubleValue() {
        System.out.println(value.doubleValue());
    }
}

public class GenericHierarchyDemo {

    public static void main(String[] args) {

        NumberBox<Integer> box = new NumberBox<>();

        box.setValue(50);

        System.out.println(box.getValue());

        box.showDoubleValue();
    }
}
