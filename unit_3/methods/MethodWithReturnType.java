public class MethodWithReturnType {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodWithReturnType c = new MethodWithReturnType();
        int result = c.add(15, 25);
        System.out.println("Sum = " + result); // Sum = 40
    }
}
