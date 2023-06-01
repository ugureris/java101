import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int number=input.nextInt();

        for (int i=0;i<number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
}