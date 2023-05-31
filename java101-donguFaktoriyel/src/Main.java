import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int fakt=1;
        Scanner inp=new Scanner(System.in);
        x=inp.nextInt();
        for ( int i=1;i<=x;i++){
            fakt*=i;
        }
        System.out.println(fakt);


    }
}