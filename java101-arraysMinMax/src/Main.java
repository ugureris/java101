public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("En küçük sayı: " + min + "\nEn büyük sayı: " + max);
    }
}