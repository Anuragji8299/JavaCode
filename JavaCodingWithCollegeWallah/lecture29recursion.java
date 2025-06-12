package JavaCodingWithCollegeWallah;

 class exponent{

     int pow(int p,int q){
//     Base work
        if(q==0) {
            return 1;
        }//Recursive work   self work
        return pow(p,q-1)*p;

     }
 }

public class lecture29recursion {

    public static void main(String[] args) {
        //p^q using recursion
   exponent ex=new exponent();
        System.out.println("The answer is: "+ex.pow(3,4));

    }
}
