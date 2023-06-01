import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz Ay(Sayı Olarak): ");
        int month=input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        int day=input.nextInt();

        if ((day>=1) && (day<=31)){
            if (month==1){
                if(day<22){
                    System.out.println("Burcunuz Oğlak");
                }else {
                    System.out.println("Burcunuz Kova");
                }
            } else if(month==2){
                if (day<=19){
                    System.out.println("Burcunuz Kova");
                }else {
                    System.out.println("Burcunuz Balık");
                }
            } else if(month==3){
                if(day<=20){
                    System.out.println("Burcunuz Balık");
                }else {
                    System.out.println("Burcunuz Koç");
                }
            } else if(month==4){
                if(day<=20){
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            } else if(month==5){
                if(day<=21){
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            } else if(month==6){
                if(day<=22){
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            } else if(month==7){
                if(day<=22){
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            } else if(month==8){
                if(day<=22){
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            } else if(month==9){
                if(day<=22){
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else if(month==10){
                if(day<=22){
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            } else if(month==11){
                if(day<=21){
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else if (month==12){
                if(day<=21){
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            } else {
                System.out.println("Hatalı Giriş");
            }

        } else {
            System.out.println("Hatalı Giriş");
        }
    }
}