package lecture9printingpattern;

public class PrintPattern7 {

//           *
//          ***
//         *****
//        *******
//       *********    there are total  5 rows and 9 columns



    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
                for(int space=5-i;space>0;space--){
                    System.out.print(" ");
                }
                for(int star=1;star<2*i;star++){
                    System.out.print("*");
                }
                for(int space=5-i;space>0;space--){
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}
