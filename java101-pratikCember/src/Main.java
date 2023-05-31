import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double cevre, alan, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap Girin: ");
        r = inp.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Çemberin Çevresi: " + cevre);
        System.out.println("Çemberin Alanı: " + alan);


    }
}