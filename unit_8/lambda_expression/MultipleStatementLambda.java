package lambda_expression;

interface Calculator {
    int calculate(int a, int b);
}

public class MultipleStatementLambda {
    public static void main(String[] args) {

        Calculator c = (a, b) -> {
            int result = a + b;
            return result;
        };

        System.out.println(c.calculate(10, 20));
    }
}
