package JavaCodingWithCollegeWallah;

public class lecture36FrogSum {
    //problem1:Best path to jump so that minimum expenditure of money:

//    static int best(int[]h,int n,int idx){
//        //Recursive work:
//        if(idx==n-1){
//            return 0;
//        }
//
//        int opt1=Math.abs(h[idx]-h[idx+1])+best(h,n,idx+1);
//        if(idx==n-2){
//            return opt1;
//        }
//        int opt2=Math.abs(h[idx]-h[idx+2])+best(h,n,idx+2);
//        return Math.min(opt1,opt2);
//    }
    static void combination(String dig,String[] kp,String res){
          if(dig.length()==0){
              System.out.println(res+" ");
              return;
          }

          int currNum=dig.charAt(0)-'0';
          String currChoices=kp[currNum];

          for(int i=0;i<currChoices.length();i++){
              combination(dig.substring(1),kp,res+currChoices.charAt(i));
          }
    }


    public static void main(String[] args) {
//Problem1: FrogJump
// int[]arr={12,15,16,21,23};
//int min=best(arr,5,0);
//        System.out.println(min);

        //Problem2:String containing digits from 2-9 inclusive retrun all possible all letters combination that the number could represent.

String digit="253";
String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//           0   1   2    3     4      5     6     7     8      9
combination(digit,kp,"");
    }
}
