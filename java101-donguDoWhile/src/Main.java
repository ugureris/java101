import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pwd;
        boolean isPwdFalse=true;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Şifrenizi Girin: ");
            pwd=inp.nextInt();
            if (pwd==123){
                System.out.println("Şifre Doğru");
                isPwdFalse=false;
            } else {
                System.out.println("Şifre Yanlış");
            }
        } while (isPwdFalse);


    }
}