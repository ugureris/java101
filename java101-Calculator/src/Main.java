import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2,select;
        double sonuc;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayı: ");
        n2 = inp.nextInt();

        System.out.println("Toplama için - 1");
        System.out.println("Çıkarma için - 2");
        System.out.println("Çarpma için - 3");
        System.out.println("Bölme için - 4");

        select=inp.nextInt();

        switch (select){
            case 1:
                sonuc=n1+n2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println(sonuc);
                break;
            case 4:
                if (n2!=0){
                    sonuc=n1/n2;
                    System.out.println(sonuc);
                }else {
                    System.out.println("Bir Sayı 0'a Bölünemez");
                }

                break;
            default:
                System.out.println("Hatalı Seçim");

        }

    }
}