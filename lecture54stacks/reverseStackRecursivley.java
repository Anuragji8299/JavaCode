package lecture54stacks;

import java.util.Stack;

public class reverseStackRecursivley {

    public static void pushAtBottom(Stack<Integer>s,int x){
      if(s.size()==0){
          s.push(x);
          return;
      }

      int top=s.pop();
      pushAtBottom(s,x);
      s.push(top);
      return;
    }
    public static void ReverseStack(Stack<Integer> s){

        if(s.size()==1){
            return;
        }

        int top=s.pop();

        ReverseStack(s);
        pushAtBottom(s,top);
        return;

    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        ReverseStack(st);
        System.out.println(st);
    }
}
