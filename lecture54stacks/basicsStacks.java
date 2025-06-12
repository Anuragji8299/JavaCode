package lecture54stacks;

import java.util.Stack;

public class basicsStacks {

    public static void printRecursively(Stack<Integer> st){
        if(st.size()<1){
            return;
        }
        int top=st.pop();
        printRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(15);
        st.push(18);
        st.push(21);
        st.push(24);
        st.push(27);
        st.push(30);
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st);
//        System.out.println("Size of stack is "+st.size());
//        while (st.size()>3){
//            st.pop();
//        }
//        System.out.println(st.pop());

        Stack<Integer> rt=new Stack<>();
//        Stack<Integer> gt=new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            gt.push(rt.pop());
//        }
//        while (gt.size()>0){
//            st.push(gt.pop());
//        }
//        System.out.println(st);
//        while(st.size()>=3){
//          rt.push(st.pop());
//
//        }
//        st.push(23);
//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);

        //Suppose if there is no method to print then what will we do,we will see now
//                while(st.size()>0){
//          rt.push(st.pop());
//                }
//         while(rt.size()>0){
//             System.out.print(rt.peek()+" ");
//             st.push(rt.pop());
//         }
//        System.out.println(st.empty());


        //Print stack recursively

        printRecursively(st);
        System.out.println(st);

    }
}
