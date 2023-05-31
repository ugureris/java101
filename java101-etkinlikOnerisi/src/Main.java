import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);

        System.out.print("Etkinlik Önerisi İçin Sıcaklık Değerini Girin: ");
        temp = inp.nextInt();

        if (temp < 5) {
            System.out.println("Bu havada kayak yapabilirsiniz :)");
        } else if (temp > 5 && temp < 10) {
            System.out.println("Bu havada sinemaya gidebilirsiniz :)");
        } else if (temp>10&&temp<15) {
            System.out.println("Bu havada sinemaya veya pikniğe gidebilirsiniz :)");
        } else if (temp > 15 && temp < 25) {
            System.out.println("Bu havada piknik yapabilirsiniz :)");
        } else if (temp > 25) {
            System.out.println("Bu havada yüzmeye gidebilirsiniz :)");
        }


    }
}