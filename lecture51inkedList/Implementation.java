package lecture51inkedList;

public class Implementation {
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
      int size=0;

      public void insertAtBeg(int val){
          Node temp=new Node(val);
          if(head==null){
              head=temp;
              tail=temp;
          }
          else{
              temp.next=head;
              head=temp;
          }
           size++;
      }

      public  void insertAtIndex(int index,int val){
          Node t=new Node(val);
          Node temp=head;

          if(index==1){
              insertAtBeg(val);
              return;
          }

          if(index==size+1){
             insertAtEnd(val);
             return;
          }
          else if(index<1||index>size){
              System.out.println("Wrong Entry");
          }

         for(int i=1;i<index-1;i++){
             temp=temp.next;
         }
         t.next=temp.next;
         temp.next=t;
         size++;


      }

      public void getAt(int index){
          Node temp=head;
          for(int i=1;i<=index-1;i++){
              temp=temp.next;
          }
          System.out.println(temp.data);

      }
        public void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

//        public void insertAtEndPoint(int val){
//          Node t=new Node(val);
//          Node temp=head;
//          while(temp.next!=null){
//              temp=temp.next;
//          }
//          temp.next=t;
//          t.next=null;
//        }


        public void display(){
            System.out.print("Linked List is given as--> ");
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
//        int size(){
//            System.out.print("\nSize of Linked List is given as--> ");
//            Node temp=head;
//            int count=0;
//            while (temp!=null){
//               count++;
//                temp=temp.next;
//            }
//            return count;
//        }
    }


    public static void main(String[] args) {
LinkedList ll=new LinkedList();
//     ll.insertAtEnd(10);
//ll.insertAtEnd(20);
ll.insertAtBeg(5);
        ll.insertAtBeg(3);
        ll.insertAtBeg(2);
ll.insertAtBeg(1);
ll.insertAtIndex(4,7);
ll.display();
//        ll.insertAtIndex(1,8);
//ll.insertAtEndPoint(12);
        ll.display();
        System.out.print("\n"+ll.size+"\n");
        System.out.println(ll.tail.data);
        ll.getAt(4);

    }
}
