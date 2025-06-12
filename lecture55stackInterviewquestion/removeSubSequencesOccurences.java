package lecture55stackInterviewquestion;

import java.util.Stack;

public class removeSubSequencesOccurences{
   public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if (arr[i]==st.peek() ) {
                if (i==n-1||arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int []result=new int[st.size()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] =st.pop();

        }

        return result;
    }




    public static void main(String[] args){
        int []arr={1,2,3,3,4,4,5,5,5,6,7,2,8,9,9};
        int[]result = remove(arr);
        System.out.println("Array after removing all subsequences of multiple times");
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
