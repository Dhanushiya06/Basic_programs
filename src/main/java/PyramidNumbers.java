import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows:");
        int n = scanner.nextInt();
        int rowCount = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= i*2 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rowCount; k++) {
                System.out.print(k + " ");
            }
            for (int k = rowCount - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}


