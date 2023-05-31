import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;
        int sonuc=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı: ");
        x=inp.nextInt();
        System.out.print("Üs: ");
        y=inp.nextInt();

        for (int i=1;i<=y;i++){
          sonuc*=x;
        }
        System.out.println(sonuc);


    }
}