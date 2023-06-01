import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci kaç seri ilerlesin?: ");
        int end = input.nextInt();
        int n1 = 0, n2 = 1, sum = 0;
        System.out.println("0\n1");
        for (int i = 1; i < end; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }


    }
}