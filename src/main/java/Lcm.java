import java.util.Scanner;

public class Lcm {
    public static void main(String args[]) {
        int first, second, max, step, lcm = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        first = scanner.nextInt();
        System.out.println("Enter second number :");
        second = scanner.nextInt();
        if (first > second) {
            max = step = first;
        } else {
            max = step = second;
        }
        while (first != 0) {
            if (max % first == 0 && max % second == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println("LCM of given numbers is : " + lcm);
    }
}

