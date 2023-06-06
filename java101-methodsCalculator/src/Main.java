import java.util.Scanner;

public class Main {
    static int sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int sub(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int multi(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int divide(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("İkinci sayı 0'dan büyük olmalı.");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int pow(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }

    static void alanCevre(int n1, int n2) {
        System.out.println("Alan: " + (n1 * n2));
        System.out.println("Cevre: " + ((n1 + n2) * 2));

    }

    static int modAlma(int n1, int n2) {
        return n1 % n2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "************\n"
                + "1-Toplama\n"
                + "2-Çıkarma\n"
                + "3-Çarpma\n"
                + "4-Bölme\n"
                + "5-Üslü Sayı Hesaplama\n"
                + "6-Dikdörtgende Alan ve Çevre\n"
                + "7-Mod Alma\n"
                + "0-Çıkış Yap\n";
        System.out.println(menu);
        while (true) {

            System.out.print("Bir İşlem Seçiniz: ");
            int select = input.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayı: ");
            int n1 = input.nextInt();
            System.out.print("İkinci Sayı: ");
            int n2 = input.nextInt();

            switch (select) {
                case 1:
                    sum(n1, n2);
                    break;

                case 2:
                    sub(n1, n2);
                    break;

                case 3:
                    multi(n1, n2);
                    break;

                case 4:
                    divide(n1, n2);
                    break;

                case 5:
                    pow(n1, n2);
                    break;

                case 6:
                    alanCevre(n1, n2);
                    break;

                case 7:
                    System.out.println(modAlma(n1,n2));
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");

            }


        }

    }
}