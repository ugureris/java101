import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n= input.nextInt();
        int[] numbers=new int[n];

        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı: ");
            numbers[i]=input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}