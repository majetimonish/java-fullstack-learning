package loops;
import java.util.Scanner;

public class SubractProductAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;

        while (num>0) {
            int digit = num % 10;

            product = product * digit;
            sum = sum + digit;

            num = num / 10;
        }
        int answer = product - sum;
        System.out.println("The Answer is " + answer);
        sc.close();
    }
}
