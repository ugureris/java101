import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner inp=new Scanner(System.in);





      /*  for (int i=1;i<=x;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        } */
        int top=0;
   /*     if(x>0){
            for (int i=1;i<=x;i++){
                if(i%2==0){
                    continue;
                }
                top+=i;
                System.out.println(top);
            }

        }*/

        do {
            System.out.print("Sayı: ");
            x=inp.nextInt();
            if(x%2==1){
                top+=x;
            }
        } while (x>0);
            System.out.println("Toplam: "+top);



    }
}