package lecture49Substrings;

public class reverseEachWord {

    public static void main(String[] args) {
        //  I am  Anurag Chaurasia
        //  I ma  garuna aisaruahc
        String s="I am  Anurag Chaurasia";

       StringBuilder st=new StringBuilder();
       String ans="";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                st.reverse();
                ans+=st+" ";
                st.delete(0,st.length());
            }
            else {
                char ch = s.charAt(i);
                st.append(ch);
            }
        }
        st.reverse();
        ans+=st;
        System.out.println(ans);
    }
}
