public class StaticMethod {
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int result = square(5); // calling static method
        System.out.println(result);
        StaticMethod obj = new StaticMethod();
        obj.testMethod();
    }

    void testMethod(){
        System.out.println(square(4));
    }
}