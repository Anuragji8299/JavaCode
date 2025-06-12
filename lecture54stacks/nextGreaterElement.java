package lecture54stacks;

import java.util.Stack;

public class nextGreaterElement {

    public static int [] next(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int []result=new int[n];
        result[n-1]=-1;
        st.push(arr[n-1]);

        for(int i=n-2;i>=0;i--){
//          if(arr[i]<st.peek()){
//              result[i]=st.peek();
//              st.push(arr[i]);
//          }

              while (st.peek()<arr[i]&& st.size()>0){
                  st.pop();
              }
              if(st.size()==0){
                  result[i]=-1;
              }
              else{
                  result[i]=st.peek();
                  st.push(arr[i]);
              }
//                  st.push(arr[i]);

          }

        return result;
        }




    public static void main(String[] args) {
        int []arr={1,5,3,2,1,6,3,4};
        int[]result = next(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
