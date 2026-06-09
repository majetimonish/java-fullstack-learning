package loops;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Factors of a given Number are : ");

        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

            }

        }
        sc.close();
    }
}
