public class Main {
    public static void main(String[] args) {

      /*  for (int i=1;i<=10;i++){
            if (i==3){
                continue;
            }

            if (i==5){
                System.out.println("i değeri 5");
                break;
            }
            System.out.println(i);
        } */

        int i = 0;

        while (i < 10) {
            i++;
            if (i%2==0){
                continue;
            }

            System.out.println(i);

        }

    }
}