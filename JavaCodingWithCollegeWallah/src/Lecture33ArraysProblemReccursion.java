package JavaCodingWithCollegeWallah;

public class Lecture33ArraysProblemReccursion {

//    static boolean search(int[]arr,int index,int n,int target){
//       //Base case
//        if(index>=n){
//            return false;
//        }
//        //Self work
//        if(arr[index]==target){
//            return true;
//        }
//        //recursive work
//       return search(arr,index+1,n,target);
//
//    }
//static int findIndex(int[]arr,int index,int n,int target){
//    //Base case
//    if(index>=n){
//        return -1;
//    }
//    //Self work
//    if(arr[index]==target){
//        return index;
//    }
//    //recursive work
//    return findIndex(arr,index+1,n,target);
//
//}
static void findAllIndices(int[]arr,int index,int n,int target){
    //Base case
    if(index>=n){
        return;
    }
    //Self work
    if(arr[index]==target){
        System.out.print(index+", ");
    }
    //recursive work
    findAllIndices(arr,index+1,n,target);

}


    public static void main(String[] args) {
  int [] arr={14,11,8,9,15,14};
  int target=14;
  int n=arr.length;
  //problem1:Searching the targeted element is present or not
//  if(search(arr,0,n,target)){
//      System.out.println("Is targeted element is present--> YES");
//  }
//  else{
//      System.out.println("Is targeted element is present--> NO");
//  }


//      System.out.println("Index of targeted element is-->"+findIndex(arr,0,n,target));

      //problem3:Finding indices of a single targeted element present in array at many positions
        System.out.print("Indices of targeted element is--> ");
 findAllIndices(arr,0,n,target);



    }
}
