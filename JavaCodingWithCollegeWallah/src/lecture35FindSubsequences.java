package JavaCodingWithCollegeWallah;

import java.util.ArrayList;

public class lecture35FindSubsequences {
//    static ArrayList<String> getSSQ(String s){
//        ArrayList<String> ans=new ArrayList<>();
    //Base work
//        if(s.length()==0){
//            ans.add("");
//            return ans;
//        }
//        //Self work
//
//        char curr=s.charAt(0);
//        //Recursive Work
//        ArrayList<String> smallAns=getSSQ(s.substring(1));
//   for(String ss:smallAns){
//       ans.add(ss);
//       ans.add(curr+ss);
//   }
//        return ans;
//    }
    //Problem3:Solve above problem without taking ArrayList

//    static void printSSQ(String s,String currAns){
//
//        //Base Work
//
//        if(s.length()==0){
//            System.out.println(currAns);
//            return;
//        }
//        char curr=s.charAt(0);
//        String remString=s.substring(1);
//
//        printSSQ(remString,currAns+curr);
//
//        printSSQ(remString,currAns);
//
//
//
//    }
//Problem4:print  sum of all subset in array

    static void subsetSum(int[]a,int n,int idx,int currsum){
      if(idx>=n){
          System.out.println(currsum);
          return;
      }
        subsetSum(a,n,idx+1,currsum+a[idx]);
        subsetSum(a,n,idx+1,currsum);
    }

    public static void main(String[] args) {
////      ArrayList<String> ans=getSSQ("abc");
//      for(String ss:ans){
//          System.out.println(ss);
//      }


      //Problem3:Solve above problem without taking ArrayList
// printSSQ("abc","");

//Problem4:print  sum of all subset in array

int []arr={2,4,5};
subsetSum(arr,3,0,0);
    }
}
