public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 4, 1, 9, 4, 3, 7, 4, 3, 1, 2, 6, 7, 9, 4, 1};
        int counter = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i] == list[j])) {
                    counter++;
                    break;
                }
                if (counter >= 2) {
                    System.out.println(list[j] + " sayısı " + counter);
                }
            }

        }
    }
}