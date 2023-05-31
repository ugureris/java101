public class Main {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 12;

        if ((a < b) && (a < c)) {
            System.out.println("A En Küçük");
        } else if ((b < a && b < c)) {
            System.out.println("B En Küçük");
        } else if ((c < a && c < b)) {
            System.out.println("C En Küçük");
        } 

    }
}