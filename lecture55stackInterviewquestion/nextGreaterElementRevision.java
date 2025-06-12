package lecture55stackInterviewquestion;

import java.util.Stack;

public class nextGreaterElementRevision {

  public static int [] nextgreater(int[]nums1,int[] nums2){
    int [] result=helperStack(nums2);
    int [] ans=new int[nums2.length];
   for(int i=0;i<nums1.length;i++){

       for(int j=0;j<result.length;j++){
           if(nums1[i]<nums2[j]){
               ans[i]=result[j];
               break;
           }
       }
   }
    return ans;
  }

  public static int [] helperStack(int[]nums2){
      Stack<Integer> st=new Stack<>();
       int []helperArray=new int[nums2.length];

       helperArray[nums2.length-1]=-1;

       st.push(nums2[nums2.length-1]);
       int j= nums2.length-2;
       while(j>=0){
           if(nums2[j]<st.peek()){
               helperArray[j]=st.peek();
               st.push(nums2[j]);
           }
           else{
               while(nums2[j]>st.peek() && st.size()>0){
                   st.pop();
               }
               if(st.size()==0){
                   helperArray[j]=-1;
                   st.push(nums2[j]);
               }
           }
           j++;

       }


return helperArray;
  }

    public static void main(String[] args) {

        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
     int []finalResult=nextgreater(nums1,nums2);
     for(int i=0;i< finalResult.length;i++){
         System.out.print(finalResult[i]+" ");
     }

    }
}
