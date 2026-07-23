public class MultipleMethodsInClass {
    int length = 10;
    int breadth = 5;

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }

    public static void main(String[] args) {
        MultipleMethodsInClass r = new MultipleMethodsInClass();
        r.display();
        // Area = 50
        // Perimeter = 30
    }
}
