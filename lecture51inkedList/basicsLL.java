package lecture51inkedList;

public class basicsLL {

    //Problem1:linked printed normally
//    public static void diplayLL(Node head){
//        Node temp=head;
//        System.out.print("Linked list is given as--> ");
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }


    //Problem 2:Print linked list in recursive manner
//    public static void printRecursively(Node head){
//        if(head==null){
//            return;
//        }
//        System.out.print(head.data+" ");
//        printRecursively(head.next);
//    }



    //Problem3 print linked List in reverse order
//public static void printRecursivelyReverseOrder(Node head){
//    if(head==null){
//        return;
//    }
//    printRecursivelyReverseOrder(head.next);
//    System.out.print(head.data+" ");
//
//}


    //Problem4:finding the length of the linked list
    public static void findingTheLength(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The length of given linkedList is given as "+count);
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;
        public void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
    }

    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);

        a.next=b;
       b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

//Problem1:linked printed normally
//        diplayLL(a);


//        System.out.print("Linked list in recursive manner is given as--> ");
        //Problem 2:Print linked list in recursive manner
//        printRecursively(a);


        //Problem3 print linked List in reverse order
//        System.out.print("LinkedList in reverse order is given as--> ");
//        printRecursivelyReverseOrder(a);


        //Problem4:finding the length of the linked list

//        findingTheLength(a);


    }
}
