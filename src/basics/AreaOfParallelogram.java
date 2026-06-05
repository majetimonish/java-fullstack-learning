package basics;
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        double base = sc.nextDouble();
        System.out.print("Enter Height : ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("Area of Parallerogram = " + area);
        sc.close();
    }
}
