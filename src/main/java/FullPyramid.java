import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Rows: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" * " + "");
            }
            System.out.println();
        }
    }
}
