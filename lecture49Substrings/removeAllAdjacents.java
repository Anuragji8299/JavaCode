package lecture49Substrings;

public class removeAllAdjacents {


    public static void main(String[] args) {
        String s="accab";
      StringBuilder ans=new StringBuilder();

       ans.append(s.charAt(0));
       


        int i=1;
        int j=0;
        while(i<s.length()){


            if(ans.length()!=0&&(s.charAt(i)==ans.charAt(j))){
                ans.deleteCharAt(j);
                j--;
                i++;

            }
            else{
               ans.append(s.charAt(i));
               j++;
               i++;
            }

        }

        System.out.println(ans);
    }
}
