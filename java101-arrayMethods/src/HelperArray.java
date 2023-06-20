public class HelperArray {

    void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    void indexPrint(int[] arr, int first, int end, int value) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i >= first && i < end) {
                arr[i] = value;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    void copyArr(int[] arr, int newLength) {
        System.out.print("[");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    static boolean equals(int[] l1, int[] l2) {

        if (l1.length != l2.length) {
            return false;
        }
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] != l2[i]) {
                return false;
            }
        }

        return true;
    }

}
