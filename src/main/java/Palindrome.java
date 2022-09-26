import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String : ");
        String s = scanner.nextLine();
        for (int i =0 ; i < s.length(); i++) {
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                System.out.println("String is not palindrome ");
                break;
            }
            else{
                System.out.println("String is palindrome");
                break;

            }
        }
    }
}
