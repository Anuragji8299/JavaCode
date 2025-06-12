package lecture55stackInterviewquestion;

import java.util.Stack;

public class infixRevision {


    public static void main(String[] args) {


        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        //2+5*3/3-5
//       String str= "2+5*3/3-5";
        String str= "9-5+3*4/6";
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           int ascii=(int)ch;
           if(ascii>=48&&ascii<=57){
               val.push(ascii-48);
           }
           else if(op.size()==0) op.push(ch);
           else {
               if (ch == '*' || ch == '/') {
                   if (op.peek() == '+' || op.peek() == '-') op.push(ch);
                   int val2 = val.pop();
                   int val1 = val.pop();
                   if (op.peek() == '*') {
                       val.push(val1 * val2);
                       op.pop();
                       op.push(ch);
                   }
                   if (op.peek() == '/') {
                       val.push(val1 / val2);
                       op.pop();
                       op.push(ch);
                   }


               } else if (ch == '+' || ch == '-') {

                   int val2 = val.pop();
                   int val1 = val.pop();
                   if (op.peek() == '*') val.push(val1 * val2);
                   if (op.peek() == '/') val.push(val1 / val2);
                   if (op.peek() == '+') val.push(val1 + val2);
                   if (op.peek() == '-') val.push(val1 - val2);
                   op.pop();
                   op.push(ch);
               }
           }

       }

       while(val.size()>1){
           int val2=val.pop();
           int val1=val.pop();
           if(op.peek()=='*') val.push(val1*val2);
           if(op.peek()=='/') val.push(val1/val2);
           if(op.peek()=='+') val.push(val1+val2);
           if(op.peek()=='-') val.push(val1-val2);
           op.pop();
       }

        System.out.println("Result after evaluation is: "+val.peek());
    }
}

