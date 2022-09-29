import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Rows: ");
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || i == 0)
                    count = 1;
                else
                    count = count * (i - k + 1) / k;
                System.out.print(count + "  ");
            }
            System.out.println();
        }
    }
}
