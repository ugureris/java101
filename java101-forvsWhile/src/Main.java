import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner inp= new Scanner(System.in);
/*
        for(boolean run=true;run;){
            System.out.print("Sayı Girin: ");
            sayi=inp.nextInt();
            if (sayi<0){
                run=false;
            }
        } */

      /*  sayi=inp.nextInt();
        while (sayi>0){
            sayi=inp.nextInt();
        } */

        do {
            sayi=inp.nextInt();
        }
        while (sayi>0);
    }
}