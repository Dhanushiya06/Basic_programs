import java.util.Scanner;

public class HalfPyramidAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of rows: ");
        int n = scanner.nextInt();
        int alpbhabet = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alpbhabet + j) + " ");
            }
            System.out.println();
        }
    }
}
