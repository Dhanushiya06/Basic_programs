import java.util.Scanner;

public class FirstSubStringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String str = scanner.nextLine();

        int index = str.indexOf(" ");
        String subStr = str.substring(0, index);

        int count = (str.split(subStr, -1).length) - 1;
        System.out.println(count);
    }
}
