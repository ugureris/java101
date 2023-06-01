import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculuk = input.nextInt();

        double total, indYas, indTip;
        total = mesafe * 10 / 100;

        if (mesafe > 0) {
            if (yas < 12) {
                indYas = total * 50 / 100;
                if (yolculuk == 1) {
                    total = total - indYas;
                    System.out.println("Toplam Tutar = " + total);
                } else if (yolculuk == 2) {
                    indTip = (total - indYas) * 20 / 100;
                    total = (total - indYas - indTip) * 2;
                    System.out.println("Toplam Tutar = " + total);
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            } else if (yas >= 12 && yas < 24) {
                indYas = total * 10 / 100;
                if (yolculuk == 1) {
                    total = total - indYas;
                    System.out.println("Toplam Tutar = " + total);
                } else if (yolculuk == 2) {
                    indTip = (total - indYas) * 20 / 100;
                    total = (total - indYas - indTip) * 2;
                    System.out.println("Toplam Tutar = " + total);
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            } else if (yas >= 65) {
                indYas = total * 30 / 100;
                if (yolculuk == 1) {
                    total = total - indYas;
                    System.out.println("Toplam Tutar = " + total);
                } else if (yolculuk == 2) {
                    indTip = (total - indYas) * 20 / 100;
                    total = (total - indYas - indTip) * 2;
                    System.out.println("Toplam Tutar = " + total);
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            } else {
                if (yolculuk == 1) {
                    System.out.println("Toplam Tutar = " + total);
                } else if (yolculuk == 2) {
                    indTip = total * 20 / 100;
                    total = (total - indTip) * 2;
                    System.out.println("Toplam Tutar = " + total);
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}