package lecture9printingpattern;

public class PrintPattern9 {

    public static void main(String[] args) {

        for(int i=1;i<=8;i++){
            if(i<=4){
                    for(int space=4-i;space>0;space--){
                        System.out.print(" ");
                    }
                    for(int star=1;star<2*i;star++){
                        System.out.print("*");
                    }
                    for(int space=4-i;space>0;space--){
                        System.out.print(" ");
                    }
                    System.out.println();
            }
            else{
                for(int j=1;j<=(i-5);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(7-2*(i-5));j++){
                    System.out.print("*");
                }
                for(int j=1;j<=(i-1);j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
