public class InstanceMethod {
    void show() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        InstanceMethod d = new InstanceMethod();
        d.show(); // Instance Method
    }
}
