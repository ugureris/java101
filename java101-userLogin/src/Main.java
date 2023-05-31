import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, pwd;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kulanıcı Adı Girin: ");
        userName = inp.nextLine();

        System.out.print("Şifre Girin: ");
        pwd = inp.nextLine();

        if(userName.equals("ugureris") && pwd.equals("123456")){
            System.out.println("Giriş Yapıldı");
        }else {
            System.out.println("Hatalı Giriş");
        }


    }
}