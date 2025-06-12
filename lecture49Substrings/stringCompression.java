package lecture49Substrings;

public class stringCompression {

        public static void main(String[] args) {

            //  aaabbbbccd--> a3b4c2d1;
            String s="aaabbbbccdd";
            int count=1;
            String ans=""+s.charAt(0);
            for(int i=1;i<s.length();i++){
                char prev=s.charAt(i-1);
                char curr=s.charAt(i);
                if(prev==curr){
                    count++;
                }

                else{
                    ans+=count+""+s.charAt(i);
//                    ans+=;
                    count=1;
                }
            }
            ans+=count;
            System.out.println(ans);



    }
}
