import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kenar1, kenar2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kenarı Girin: ");
        kenar1 = inp.nextInt();

        System.out.print("İkinci Kenarı Girin: ");
        kenar2 = inp.nextInt();

        double hipo = Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);

        System.out.println("Hipotenüs: " + hipo);

    }
}