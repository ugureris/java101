public class Main {
    static int sum(int a, int b) {
        return a + b;
    }

    static void top(int c, int d) {
        int res = c + d;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int result = sum(4, 2);
        System.out.println(result);

        top(3, 5);

    }
}