public class Main {
    public static void main(String[] args) {
        int[][] matris=new int[8][10];
        int number=0;
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                matris[i][j]=number+=2;
            }
        }
        for (int i=0;i<matris.length;i++){

            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]+"\t\t");
            }
            System.out.println();
            System.out.println();
        }



    }
}