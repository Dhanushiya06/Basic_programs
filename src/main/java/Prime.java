import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

//        Print prime numbers within a range

        System.out.println("Enter min: ");
        int min = scanner.nextInt();
        System.out.println("Enter max: ");
        int max = scanner.nextInt();
        int flag = 0;
        for (int n = min; n <= max; n++) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = flag + 1;
                    break;
                }
            }
            if (flag == 0 && n != 1) {
                System.out.print(n+ " ");
            } else {
                flag = 0;
            }
        }


        //Any number is Check prime or not
        System.out.println("Enter the number: ");
        int m = scanner.nextInt();
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0) {
                flag = flag + 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(m + " Prime number");
        } else {
            System.out.println(m + " Not Prime number");
        }
    }
}




