import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuzu Girin: ");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        muzik=inp.nextInt();

        double ort=(mat+fizik+kimya+muzik+tarih+turkce)/6;

        boolean a = ort>60;

        String sonuc = a ? "Geçtiniz :)" : "Kaldınız";

        System.out.println("Ortalamanız: "+ort);
        System.out.println(sonuc);

    }
}