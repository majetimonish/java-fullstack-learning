package loops;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        for(int i = 1; i <= 8 ; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");

        }
    }
}
