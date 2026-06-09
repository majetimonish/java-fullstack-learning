package basics;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double first = sc.nextDouble();

        System.out.print("Enter Second Number : ");
        double second = sc.nextDouble();

        double sum = first + second;
        System.out.print("Sum of given Numbers is : " + sum);
        sc.close();
    }
}
