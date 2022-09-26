import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String : ");
        String s = scanner.nextLine();
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s1);
    }
}

