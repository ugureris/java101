import java.util.Scanner;

public class Main {
    static void pattern(){
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n=input.nextInt();
        int firstNumber=n;
        System.out.print("Çıktı: "+firstNumber);
        for (int i=n;i>=0;i-=5){
            firstNumber-=5;
            System.out.print("\t" + firstNumber);
        }
        int lastNumber=firstNumber;
        for (int i=lastNumber;i<n;i+=5){
            lastNumber+=5;
            System.out.print("\t"+lastNumber);
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}