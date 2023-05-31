public class Main {
    public static void main(String[] args) {
        int basValue;
        int basPow;
        int result=0;
        int birler, onlar, yuzler;


        for (int i=100;i<=999;i++){
           birler=i%10;
           onlar=(i/10)%10;
           yuzler=i/100;

           result=birler*birler*birler+onlar*onlar*onlar+yuzler*yuzler*yuzler;
           if (i==result){
               System.out.println(i);
           }
        }

    }
}