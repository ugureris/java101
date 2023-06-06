public class Main {

    static void printArray(int[] arr){
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    static void printArray(double[] arr){
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }

    static int[] reverse(int[] arr){
        int[] reverse=new int[arr.length];
        for (int i=0, j=arr.length-1;i<arr.length;i++,j--){
            reverse[i]=arr[j];
        }
        return reverse;
    }

    static void printArrays(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = new int[10];

        //      list[0]=10;
        //      list[1]=20;
        //      System.out.println(list[10]);
        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }
        System.out.println("\n");

        int[] list1={10,20,30,40,50,60,70,80,90,100};
        int[] newList=reverse(list1);
        printArrays(newList);
        System.out.println("*****");
        printArray(list);


        System.out.println("*********");

        double[] list2={1.1,1.2,1.3,2.2,3.3};
        printArray(list2);



    }
}