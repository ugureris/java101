public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("\n*********\n");
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n*********\n");

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int[] row : matris) {
            for (int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


}