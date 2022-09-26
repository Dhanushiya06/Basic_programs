import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("String: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

