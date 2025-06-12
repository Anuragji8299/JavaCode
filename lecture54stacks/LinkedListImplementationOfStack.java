package lecture54stacks;

public class LinkedListImplementationOfStack {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public static class Stack{
        Node head=null;
        int size=0;

        void  push(int val){

            Node p=new Node(val);

                p.next=head;
                head=p;
                size++;
        }
        void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Deleted element is "+head.val);
            head=head.next;
            size--;
        }
        int peek(){
            int x=head.val;
            return x;
        }
        void display(Node head){

            if(head==null){
                return;
            }
            display(head.next);
            System.out.print(head.val+" ");
        }

        void displayStack(){
            display(head);
        }
        boolean isEmpty(){
            if(size==0){
             return true;
            }
            else return false;
        }
    }



    public static void main(String[] args) {

        Stack st=new Stack();
        st.push(12);
        st.push(14);
        st.push(15);
        st.push(10);
        st.push(22);
        System.out.println(   st.peek());
        System.out.println(st.size);
        st.pop();
        st.push(28);
        st.push(56);
        st.push(112);

        st.displayStack();

    }
}
