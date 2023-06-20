import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adet;
        int sayi;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Kaç tane sayı gireceksiniz?: ");
            adet = input.nextInt();
            if (adet < 2) {
                System.out.println("En az iki sayı girmeniz gerekiyor.");
            }
        } while (adet < 2);

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}