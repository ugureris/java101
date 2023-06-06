public class Main {
    static double pow(double a,double b){
        int result=1;
        if (b==0){
            return result;
        }
        return Math.pow(a,b);
    }
    public static void main(String[] args) {

        System.out.println(pow(2,5));
    }
}