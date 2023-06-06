import java.util.Scanner;

public class Main {
    static int isPrime(int number){
        int prime=0;
        for (int i=2;i<number;i++){
            if (number%i==0){
                prime++;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number=input.nextInt();
        if (isPrime(number)==0){
            System.out.println("Asal");
        } else {
            System.out.println("Asal değil");
        }

    }
}