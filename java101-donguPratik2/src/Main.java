import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner inp= new Scanner(System.in);
        x=inp.nextInt();

        for (int i=1;i<=x;i*=2){
            System.out.println(i);
        }
    }
}