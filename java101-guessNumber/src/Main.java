import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin=false;

        while (right < 5) {
            System.out.println("Tahmininiz: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("0 ile 100 arasında bir sayı giriniz");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler bildiniz. :)");
                isWin=true;
                break;
            } else {

                System.out.println("Hatalı tahmin.");
                if (selected > number) {
                    System.out.println("Tahmininiz gizli sayıdan daha büyük");
                } else {
                    System.out.println("Tahmininiz gizli sayıdan daha küçük");
                }
                wrong[right]=selected;
                right++;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }


        }

        if(!isWin){
            System.out.println("Kaybettiniz. Tahminleriniz: " + Arrays.toString(wrong));
        }


    }
}