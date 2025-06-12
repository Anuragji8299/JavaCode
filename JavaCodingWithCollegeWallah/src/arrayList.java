package JavaCodingWithCollegeWallah;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

//    static void reverseList(ArrayList<Integer> list){
//      int i=0,j=list.size()-1;
//      while(i<j){
//          Integer temp=Integer.valueOf(list.get(i));
//          list.set(i,list.get(j));
//          list.set(j,temp);
//          i++;
//          j--;
//      }
//    }
    public static void main(String[] args) {
//        Integer i=Integer.valueOf(4);
//        System.out.println(i);
//        Float f=Float.valueOf(4.55f);
//        System.out.println(f);
        ArrayList<Integer> l1=new ArrayList<>();

//        ArrayList<Boolean> l2=new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(70);
        l1.add(80);
        l1.add(12);
        l1.add(10);

//        l1.add(1,100);
//        l1.set(2,200);
//        l1.remove(3);

//        System.out.println(l1.get(1));
//        for(int i=0;i< l1.size();i++){
//            System.out.print(l1.get(i)+" ");
//        }
        System.out.println(l1);
//        reverseList(l1);
        System.out.println("Array list after reversing");

        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("Ascending order "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending order "+l1);
        ArrayList<String>l2=new ArrayList<>();
        l2.add("Welcome");
        l2.add("To");
        l2.add("The");
        l2.add("Programming");
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("Sorted order "+l2);
    }
}
