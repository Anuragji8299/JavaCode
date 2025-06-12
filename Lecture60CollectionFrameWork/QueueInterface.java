package Lecture60CollectionFrameWork;

import java.util.PriorityQueue;

public class QueueInterface {

    static void priorityQueue(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(13);
        pq.add(8);
        pq.add(10);
        pq.add(18);
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);

    }

    public static void main(String[] args) {
priorityQueue();
    }
}
