import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("number: ");
        int n = scanner.nextInt();
        System.out.print(a+","+b);

        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(","+c);
            a = b;
            b = c;
        }

    }
}
