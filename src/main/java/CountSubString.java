import java.util.Scanner;

public class CountSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String s = scanner.nextLine();
        System.out.println("Find Substring: ");
        String find = scanner.nextLine();
//        int str = s.indexOf();
        int count = (s.split(find + "", -1).length) - 1;
        System.out.println(count);
    }
}



