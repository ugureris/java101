import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();
            int total = 0;


            if (number <= 1) {
                System.out.println(number + " Mükemmel sayı değildir.");
            } else {
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        total+=i;
                    }
                }

                if (total==number){
                    System.out.println(number + " Mükemmel Sayıdır.");
                } else {
                    System.out.println(number + " Mükemmel sayı değildir.");
                }

            }
        }


    }
}