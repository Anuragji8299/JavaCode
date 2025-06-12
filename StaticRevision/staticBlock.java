package StaticRevision;

public class staticBlock {


    void foo(){

    }

    int foo(int a,int b){

        return a;
    }

    void foo(int a){

    }


    static int a=8;
    static int b;
static{
    System.out.println("Hello how are you");
}

//static void run(){
//    System.out.println("I am inside the class and for execution , need not to create object I will be called by my class");
//}


    public static void main(String[] args) {
        b=a*5;
        System.out.println(b);
//        run();
//        staticBlock.driver();
//        driver();


//        System.out.println(Anurag.c);
        staticBlock block=new staticBlock();

        Anurag an=block.new Anurag();


    }

    static   void driver(){

    }

    class Anurag {
//        static final int c = 10;
     void run() {
            System.out.println("Anurag is running");


        }
    }

}




//class Anurag {
//    static final int c = 10;
//
//    static void run() {
//        System.out.println("Anurag is running");
//
//
//    }
//}
