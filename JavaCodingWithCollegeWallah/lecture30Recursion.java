package JavaCodingWithCollegeWallah;

class printTable{
    void print(int k,int q){

   //base work
     if(q==1){
         System.out.print(1+"\t");
         return ;
     }
   //recursive work
        print(k,q-1);
        //self work
        System.out.print(k*q+"\t");
    }
}
public class lecture30Recursion {
    public static void main(String[] args) {
  printTable tb=new printTable();
  tb.print(5,6);
    }
}
