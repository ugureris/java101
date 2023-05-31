import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pwd;
        boolean isPwdTrue=true;

        Scanner inp= new Scanner(System.in);

        while (isPwdTrue){
            System.out.print("Şifrenizi Girin: ");
            pwd=inp.nextInt();
            if (pwd==123){
                System.out.println("Şifre Doğru");
                isPwdTrue=false;
            }else {
                System.out.println("Şifre Yanlış");
            }
        }


    }
}