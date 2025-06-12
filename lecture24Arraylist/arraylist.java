package lecture24Arraylist;

import java.util.ArrayList;

public class arraylist {



    public static void main(String[] args) {
//        these are wrapper classes
//        Integer a=Integer.valueOf(14);
//        Float b=Float.valueOf(1.5f);

        ArrayList<Integer> l=new ArrayList<>();
        //adding new elements
        l.add(18);
        l.add(79);
        l.add(1,14);


        //get element at index i
        l.get(1);

        //modifying an element at index i
        l.set(1,10);

        //remove element at index i
l.remove(1);

//removing an element
        l.remove(Integer.valueOf(7));

        //checking if an element exists

        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        boolean ans=l.contains(5);


    }
}
