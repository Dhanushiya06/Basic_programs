import java.util.Scanner;

public class StringVowels {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int number = scanner.nextInt();
        int count =0;
        System.out.println("Enter product name: ");
        char product[] = new char[number];
        for (int i = 0; i < number; i++) {
            product[i] = scanner.next().charAt(0);
        }

        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i< product.length;i++){
            for(int j =0 ;j<vowels.length;j++) {
                if(product[i] == vowels[j]){
                    count++;
                }
        }
        }
        count = product.length - count;
        System.out.print("Product data: "+count);
    }
}
