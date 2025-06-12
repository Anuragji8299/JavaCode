package BasicOfQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {

    public static void main(String[] args) {
//        Queue<Integer> queue=new ArrayDeque<>();
        //or   10 20 30 40 50

        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> help=new LinkedList<>();

        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        while(q.size()!=0){
            int remove=q.remove();
            System.out.print(remove+" ");
            help.add(remove);

        }

        while(help.size()!=0){
            q.add(help.remove());
        }
        System.out.println();
        System.out.println(q);

//        System.out.println(q.isEmpty());
//        System.out.println(q);
//        q.remove();
//        System.out.println(q.peek());
//        q.add(50);
//        System.out.println("Size of queue is: "+q.size());
//        System.out.println(q.element());
//        System.out.println(q);


    }
}
