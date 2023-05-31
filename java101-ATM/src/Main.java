import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance=21000;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if (userName.equals("ugureris") && password.equals("dev123")) {
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    select=input.nextInt();
                    if (select==1){
                        System.out.print("Yatırmak İstediğiniz Tutar: ");
                        int price= input.nextInt();
                        balance+=price;
                    } else if (select==2){
                        System.out.print("Çekmek İstediğiniz Tutar: ");
                        int price=input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye Yetersiz.");
                        }else {
                            balance-=price;
                        }
                    } else if(select==3){
                        System.out.println("Mevcut Bakiyeniz: " + balance);
                    }

                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Oldu.");
                }
                System.out.println("Kalan Hakkınız: " + right);
            }
        }


    }
}