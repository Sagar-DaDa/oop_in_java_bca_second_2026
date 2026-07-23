import java.util.Scanner;

public class ScannerDemoTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = 10;
        int result = num * num;
        System.out.println(result);
        sc.close();
    }
}
