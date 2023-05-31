import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Girin: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber;
        int basValue;
        int result = 0;
        int basPow;

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i=1;i<=basNumber;i++){

                basPow*=basValue;
            }
            result+=basPow;
            tempNumber /= 10;
        }
        if (number==result){
            System.out.println(number + " bir Armstrong Sayı");
        } else {
            System.out.println(number + " bir Armstrong Sayı Değil");
        }



    }
}