package loops;

import java.util.Scanner;

public class LargestNumberUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int largest = 0;

        while (num !=0 ){
            System.out.print("Enter Number : ");
            num = sc.nextInt();
            if (num > largest ) {
                largest = num;
            }
        }
        System.out.print("Largest number is : " + largest);
    }
}
