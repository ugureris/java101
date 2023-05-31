import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month,day;

        Scanner inp= new Scanner(System.in);

        System.out.print("Doğduğunuz Ay(rakam olarak): ");
        month=inp.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        day=inp.nextInt();

       if ((day >=1) && (day<=31)){
           switch (month){
               case 1:
                   if(day<22){
                       System.out.println("Burcunuz Oğlak");
                   }else {
                       System.out.println("Burcunuz Kova");
                   }
                   break;
               case 2:
                   if (day<=19){
                       System.out.println("Burcunuz Kova");
                   }else {
                       System.out.println("Burcunuz Balık");
                   }
                   break;
               case 3:
                   if(day<=20){
                       System.out.println("Burcunuz Balık");
                   }else {
                       System.out.println("Burcunuz Koç");
                   }
                   break;
               case 4:
                   if(day<=20){
                       System.out.println("Burcunuz Koç");
                   } else {
                       System.out.println("Burcunuz Boğa");
                   }
                   break;
               case 5:
                   if(day<=21){
                       System.out.println("Burcunuz Boğa");
                   } else {
                       System.out.println("Burcunuz İkizler");
                   }
                   break;
               case 6:
                   if(day<=22){
                       System.out.println("Burcunuz İkizler");
                   } else {
                       System.out.println("Burcunuz Yengeç");
                   }
                   break;
               case 7:
                   if(day<=22){
                       System.out.println("Burcunuz Yengeç");
                   } else {
                       System.out.println("Burcunuz Aslan");
                   }
                   break;
               case 8:
                   if(day<=22){
                       System.out.println("Burcunuz Aslan");
                   } else {
                       System.out.println("Burcunuz Başak");
                   }
                   break;
               case 9:
                   if(day<=22){
                       System.out.println("Burcunuz Başak");
                   } else {
                       System.out.println("Burcunuz Terazi");
                   }
                   break;
               case 10:
                   if(day<=22){
                       System.out.println("Burcunuz Terazi");
                   } else {
                       System.out.println("Burcunuz Akrep");
                   }
                   break;
               case 11:
                   if(day<=21){
                       System.out.println("Burcunuz Akrep");
                   } else {
                       System.out.println("Burcunuz Yay");
                   }
                   break;
               case 12:
                   if(day<=21){
                       System.out.println("Burcunuz Yay");
                   } else {
                       System.out.println("Burcunuz Oğlak");
                   }
                   break;
               default:
                   System.out.println("Hatalı Giriş");
           }
       }else {
           System.out.println("Geçersiz Gün");
       }


    }
}