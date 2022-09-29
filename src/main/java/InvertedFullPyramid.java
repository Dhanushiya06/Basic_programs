import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Number of Rows: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
    }
}
