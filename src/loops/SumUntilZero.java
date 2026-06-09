package loops;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int sum = 0;

        while (num != 0) {
            System.out.print("Enter Number : ");
            num = sc.nextInt();

            sum = sum + num;
        }
        System.out.print("Sum of Numbers = " + sum);
        sc.close();
    }
}
