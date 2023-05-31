import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayı: ");
        n1 = inp.nextInt();

        System.out.print("İkinci Sayı: ");
        n2 = inp.nextInt();

        System.out.print("Üçüncü Sayı: ");
        n3 = inp.nextInt();

        if ((n1 > n2) && (n1 > n2)) {
            if (n2 > n3) {
                System.out.println("n1 > n2 > n3");
            } else {
                System.out.println("n1 > n3 > n2");
            }
        } else if ((n2 > n1) && (n2 > n3)) {
            if (n1>n3){
                System.out.println("n2 > n1 > n3");
            }else {
                System.out.println("n2 > n3 > n1");
            }
        } else if ((n3>n1)&&(n3>n2)){
            if (n1>n2){
                System.out.println("n3 > n1 > n2");
            } else {
                System.out.println("n3 > n2 > n1");
            }
        }



    }
}