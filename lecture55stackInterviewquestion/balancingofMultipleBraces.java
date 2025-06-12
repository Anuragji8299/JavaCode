package lecture55stackInterviewquestion;

import java.util.Scanner;
import java.util.Stack;

public class balancingofMultipleBraces {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0||((st.peek()!='('&& ch==')')||(st.peek()!='{'&& ch=='}')||(st.peek()!='['&& ch==']'))){
                    return false;
                }
                if((st.peek()=='('&& ch==')')||(st.peek()=='{'&& ch=='}')||(st.peek()=='['&& ch==']')){
                    st.pop();
                }

            }
        }
        if(st.size()!=0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the multiple braces series  which is to be checked whether balanced or not ");
        String st=sc.nextLine();
        System.out.print("Braces are balanced: ");
        System.out.println(isValid(st));
    }

}
