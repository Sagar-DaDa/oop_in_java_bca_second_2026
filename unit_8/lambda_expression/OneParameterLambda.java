interface Square {
    int calculate(int n);
}

public class OneParameterLambda {
    public static void main(String[] args) {

        Square s = n -> n * n;

        System.out.println(s.calculate(5));
    }
}
