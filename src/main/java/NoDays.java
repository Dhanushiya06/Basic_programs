import java.util.Scanner;

public class NoDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month: ");
        int month = scanner.nextInt();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        if (month == 2 && year % 4 == 0) {
            System.out.println("No of days is 29");
        } else if (month == 2) {
            System.out.println("No of days is 28");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("No of days is 31");
        } else {
            System.out.println("No of days is 30");
        }
    }
}
