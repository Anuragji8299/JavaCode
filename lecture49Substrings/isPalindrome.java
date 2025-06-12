package lecture49Substrings;

public class isPalindrome {

    public static boolean isPalindromeOrNot(String s) {

        s = s.toLowerCase();
        System.out.println(s);

        for (int i = 0; i<s.length(); i++) {

            char ch = s.charAt(i);

            int ascii = (int) ch;
//            if(ascii<97&&ascii>=65){
//                ascii+=32;
//                ch=(char)ascii;
//                s=s.substring(0,i)+ch+s.substring(i+1);
//                // s=s.replace(ch,newCh);
//            }
       if(ch==' '){
           s = s.substring(0, i) + s.substring(i + 1);
       }
            else if ((ascii >= 33 && ascii <= 47) || (ascii >= 58 && ascii <= 64)) {
                //  s=s.replace(ch,"");
                s = s.substring(0, i) + "" + s.substring(i + 1);

            }
        }
//        System.out.println(s);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s=s.substring(0,i)+s.substring(i+1);
            }
        }
//        System.out.println(s);
            int end = s.length() - 1;
            int start = 0;
            while (start < end) {
                char chStart = s.charAt(start++);
                char chEnd = s.charAt(end--);

                if (chStart != chEnd) return false;


            }


        return true;
    }

    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama";

        System.out.println(isPalindromeOrNot(s));
//        isPalindromeOrNot(s);

    }
}

//  s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
//   int end=s.length()-1;
// int start =0;
// while(start<end){

//     char chStart=s.charAt(start);
//     char chEnd=s.charAt(end);

//    if(chStart!=chEnd) return false;
//    start++;
//    end--;

// }
//  return true;
// }