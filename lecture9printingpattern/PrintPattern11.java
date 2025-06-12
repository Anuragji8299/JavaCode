package lecture9printingpattern;

public class PrintPattern11 {

    public static void main(String[] args) {
        int n=5;
        int flip=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) flip=0;
            else flip=1;
                for(int j=1;j<=i;j++){
                    System.out.print(flip);
                    flip=1-flip;
                }
             System.out.println();
        }



    }
}
