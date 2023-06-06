public class Main {
    static void print(){
        System.out.println("Parametresiz metot");
    }
    static void print(int a){
        System.out.println("Parametre: " + a);
    }
    static int print(int a,int b){
        return a+b;
    }
    static int print(int a,int b,int c){
        return a*b*c;
    }


    public static void main(String[] args) {
        print();
        print(3);
        System.out.println(print(3,2));
        System.out.println(print(3,2,4));

    }
}