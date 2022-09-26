import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n /2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}

