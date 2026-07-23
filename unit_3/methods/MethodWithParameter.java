public class MethodWithParameter {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        MethodWithParameter c = new MethodWithParameter();
        c.add(10, 20); // Sum = 30
    }
}
