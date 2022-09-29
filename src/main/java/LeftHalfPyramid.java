import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows: ");
        int n = scanner.nextInt();
        int i;
        for (i = 0; i <n; i++) {
            for (int j = 2* (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
