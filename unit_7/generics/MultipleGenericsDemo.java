class Pair<K, V> {

    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class MultipleGenericsDemo {
    public static void main(String[] args) {

        Pair<Integer, String> student =
            new Pair<>(101, "Ram");

        student.display();
    }
}
