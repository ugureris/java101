import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Girin: ");
        int n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Girin: ");
        int n2 = input.nextInt();
        int ebob = 1;

        if (n1 < n2) {
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("EBOB: " + ebob);
                    break;
                }
            }
        } else if (n2 < n1) {
            for (int i = n2; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("EBOB: " + ebob);
                    break;
                }
            }
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);


    }
}