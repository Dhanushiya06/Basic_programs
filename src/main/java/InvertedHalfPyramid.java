import java.util.Scanner;

public class InvertedHalfPyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("number of rows: ");
            int n = scanner.nextInt();
            for (int i = n; i >0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
