import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, kdv, yeniFiyat;

        Scanner inp = new Scanner(System.in);

        System.out.println("Aldığınız ürünün fiyatını girin");

        fiyat = inp.nextDouble();

        kdv = fiyat * 18 / 100;

        yeniFiyat = fiyat + kdv;

        System.out.println("KDV Tutarı: " + kdv);

        System.out.println("KDV'li Fiyat: " + yeniFiyat);
    }
}