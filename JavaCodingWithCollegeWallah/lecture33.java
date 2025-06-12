package JavaCodingWithCollegeWallah;

public class lecture33 {

    public static boolean target(int []arr,int target,int index){

           if(index==-1){
               return false;
           }
         if(target==arr[index]){
             return true;
         }

     return target(arr,target,index-1);

    }
    public static void main(String[] args) {
        int [] arr={8,5,9,3,6,4};
        System.out.println("Is targeted value present--> "+target(arr,3,arr.length-1));
    }
}
