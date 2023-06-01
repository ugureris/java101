import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int total=0;
        int number;

        do {
            System.out.print("Lütfen sayı girin: ");
            number= input.nextInt();
            if (number%2==1){
                total+=number;

            }

        } while (number>0);

        System.out.println(total);
    }
}