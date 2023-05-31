import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, biyo;
        double avg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Biyoloji Notunuz: ");
        biyo = inp.nextInt();

        avg = (mat + turkce + fizik + kimya + biyo) / 5;
        System.out.println("Ortalamanız: " + avg);
        if (avg >= 55) {
            System.out.println("Tebrikler, Geçtiniz :)");
        } else {
            System.out.println("Üzgünüm, Kaldınız");
        }


    }
}