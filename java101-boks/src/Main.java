public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("Yusuf",30,120,100,90);
        Fighter f2=new Fighter("Uğur",20,200,105,80);

        Match match=new Match(f1,f2,95,107);
        match.run();



    }
}