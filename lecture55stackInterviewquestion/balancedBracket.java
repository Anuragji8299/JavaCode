package lecture55stackInterviewquestion;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
public static boolean isBalancedCharacter(String str){
    Stack<Character> s=new Stack<>();
    int n=str.length();
    for(int i=0;i<n;i++){
        char ch=str.charAt(i);
        if(ch=='('){
            s.push(ch);
        }
        else{//')'
            if(s.size()==0){
                return false;
            }
            else{
                if(s.peek()=='('){
                    s.pop();
                }

            }
        }
    }
    if(s.size()!=0){
        return false;
    }
    return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the braces series  which is to be checked whether balanced or not ");
        String st=sc.nextLine();
        System.out.print("Braces are balanced: ");
        System.out.println(isBalancedCharacter(st));
    }
}
