package JavaCodingWithCollegeWallah;

public class lecture32 {

    public static int sum=0;

    //problem 1:
//    public static void printArray(int [] arr,int index){
//        if(index==0){
//            System.out.print(arr[index]);
//            return;
//        }
//        printArray(arr,index-1);
//
//        System.out.print(" "+arr[index]);
//    }

    //problem 2:
//    public static int printMax(int []arr,int index){
//        if(index==arr.length-1){
//            return arr[index];
//        }
//       int small= printMax(arr,index+1);
//
//        return Math.max(arr[index],small);
//    }

    //Problem 2 another approach
//public static int printMax(int []arr,int index){
//    if(index==0){
//        return arr[index];
//    }
//    int small= printMax(arr,index-1);
//
//    return Math.max(arr[index],small);
//}

    //problem 3:
    public static int sumOfArray(int []arr,int index){
        if(index==0){
            return arr[index];
        }
        sum= sum+arr[index]+sumOfArray(arr,index-1);

        return sum;

    }
    public static void main(String[] args) {

        int [] arr={8,5,9,3,6,4};



//        printArray(arr,arr.length-1);
//        System.out.println();

//        System.out.println("The maximum value in the given array is: "+printMax(arr,arr.length-1));


        System.out.println("The sum of all the value in the given array is: "+sumOfArray(arr,arr.length-1));
    }
}
