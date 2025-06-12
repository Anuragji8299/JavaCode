package lecture55stackInterviewquestion;

import java.util.Stack;

public class getMinStack {
    //1,2,5,6,4,3
    //min 3
    Stack<Integer> st=new Stack<>();
    Stack<Integer> gt=new Stack<>();

        public void push(int val){
         if(st.size()==0){
             st.push(val);
             gt.push(val);

         }
         else{
             if(gt.peek()>val){
                 st.push(val);
                 gt.push(val);
             }
             else if(gt.peek()<val){
                 gt.push(gt.peek());
                 st.push(val);

             }
         }
        }
        public void pop(){
           st.pop();
           gt.pop();
        }
        public void peek(){
            System.out.println("Peek element is "+st.peek());
        }

        public int getMin(){
           return gt.peek();
        }


    public static void main(String[] args) {
          getMinStack min=new getMinStack();
          min.push(3);
        min.push(2);
        min.push(5);
        min.push(1);
        min.push(6);
        min.push(4);

        min.pop();

        System.out.println("Minimum element in the stack is "+min.getMin());


    }
}
