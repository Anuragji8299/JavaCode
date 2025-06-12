package JavaCodingWithCollegeWallah;

import java.util.ArrayList;

public class lecture33FindAllIndicesUsingArrayList {

    static ArrayList<Integer> allIndices(int []arr,int n,int target,int indx){
        //Base case
        if(indx>=n){
            return new ArrayList<>(); //Return empty arraylist
        }
        //Self work
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[indx]==target){
            ans.add(indx);
        }
        //recursive work
        ArrayList<Integer> smallAns= allIndices(arr,n,target,indx+1);
        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,7,3,9,3};
        int target=3;
        int n=arr.length;
        ArrayList<Integer> ans= allIndices(arr,n,target,0);
//        for(Integer i:ans){
//            System.out.println(i);
//        }
        System.out.println(ans);
    }
}
