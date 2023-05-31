import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, startPrice = 10;

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz: ");
        km = inp.nextInt();

        double perKm = 2.2;
        double total = 10;

        total = startPrice + km * perKm;
        boolean a= total>20;

        String sonuc = a ? "Toplam Tutar: "+total : "Toplam Tutar: 20";
        System.out.println(sonuc);


    }
}