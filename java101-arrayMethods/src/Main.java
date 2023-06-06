import java.util.Arrays;  //javanın array sınıfını projeye dahil etme

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] list2 = {54, 78, 9, 42, 64, 7, 98};
        double[] list3 = {1.1, 1.2, 2.1, 2.2};
        int[] list4 = {78, 98, 65, 45, 12, 74, 85, 94, 62, 4, 3, 7};
        int[] list5 = {79, 11, 45, 94, -9, -745, 852, -312, 14, -90};
        int[] list6 = {79, 11, 45, 94, -9, -745, 852, -312, 14, -90};


//        HelperArray helper=new HelperArray();
//        helper.print(list);
//        System.out.println();
//        helper.print(list2);
//        System.out.println();
//        helper.print(list3);


        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(list3));

        System.out.println("\n****************\n\n");

        Arrays.fill(list, 10);       //javanın kütüphanesi, istenen değerleri tek değer yapıyor
        System.out.println(Arrays.toString(list));      //javanın kütüphanesi, istenen değerleri tek değer yapıyor
        Arrays.fill(list2, 2, 4, 12);      //javanın kütüphanesi, istenen değerleri tek değer yapıyor
        System.out.println(Arrays.toString(list2));     //javanın kütüphanesi, istenen değerleri tek değer yapıyor
        HelperArray arr = new HelperArray();      //benim metodum
        arr.indexPrint(list4, 2, 5, 11);       //benim metodum

        System.out.println("\n****************\n\n");

        Arrays.sort(list5);         //sıralama
        System.out.println(Arrays.toString(list5));

        System.out.println("\n****************\n\n");

        System.out.println(Arrays.binarySearch(list5, 79)); //istenen sayının indexini buluyor

        System.out.println("\n****************\n\n");

        int[] copyList = Arrays.copyOf(list5, 7);
        System.out.println(Arrays.toString(copyList)); //array'i belli bir uzunlukta kopyalıyor

//        HelperArray copy=new HelperArray();     //benim metodum
//        copy.copyArr(list5,4);      //benim metodum

        int[] copyList2 = Arrays.copyOfRange(list6, 3, 7);
        System.out.println(Arrays.toString(copyList2));

        System.out.println("\n****************\n\n");


        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 3};
        int[] l3 = {3, 5, 3};

        System.out.println(Arrays.equals(l1,l3));       //benim metodum
        System.out.println(HelperArray.equals(l1,l2));      //benim metodum

    }
}