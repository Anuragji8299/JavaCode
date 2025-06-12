package lecture55stackInterviewquestion;


import java.util.Stack;

public class infixBracketInvolvedRevision {


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        String inf=sc.nextLine();
            //"2+(5*4/2)-4"
        String inf="2+(5*4/2)-4";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();


        while(val.size()>1){

                int val2=val.pop();
                int val1=val.pop();
                if(op.peek()=='+') val.push(val1+val2);
               else if(op.peek()=='-') val.push(val1-val2);
               else  if(op.peek()=='*') val.push(val1*val2);
               else if(op.peek()=='/') val.push(val1/val2);
               op.pop();

        }

        System.out.println();
    }
}
