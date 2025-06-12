package lecture49Substrings;

public class toggleString {

    public static void main(String[] args) {

        //phYsIcS  PHySiCs

        String st="phYsIcS WaLLaH";

//        String ans="";

        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch==' '){
//                ans+=" ";

                continue;
            }
            int asci=(int)ch;
            if(asci>=97){
                asci-=32;
                char newCh=(char)asci;
//                ans+=newCh;
                st=st.substring(0,i)+newCh+st.substring(i+1);
            }
            else{
                asci+=32;
                char newCh=(char)asci;
//                ans+=newCh;
                st=st.substring(0,i)+newCh+st.substring(i+1);
            }

        }


        System.out.println(st);
//        System.out.println(ans);
        System.out.println(st);


    }


}
