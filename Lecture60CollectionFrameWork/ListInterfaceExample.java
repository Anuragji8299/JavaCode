package Lecture60CollectionFrameWork;

import java.util.ArrayList;

public class ListInterfaceExample {


    static void ArrayListExamples(){
        ArrayList<Integer> l=new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.set(1,6);
        l.remove(2);
        System.out.println(l);
    }


    public static void main(String[] args) {

        ArrayListExamples();
    }


}
