package lecture54stacks;

public class ImplementationOfStackUsingArray {

    public static class Stack{
      private   int []arr=new int[5];
      private int index=0;
        void push(int x){
            if(isFull()){
                System.out.println("\nStack is Full");
                return;
            }
            arr[index]=x;
            index++;
        }
        int peek(){
            if(index==0){
                System.out.println("\nStack is empty");
                return -1;
            }
            else{
                return arr[index-1];

            }
        }
        void pop(){
            if(isEmpty()){
                System.out.println("\nStack is Empty");
              return;
            }

            System.out.println("\nDeleted value is: "+arr[--index]);
            arr[index]=0;
        }
        int size(){
            return index;
        }
        boolean isFull(){
            if(index== arr.length){
                return true;
            }
            else return false;
        }
        boolean isEmpty(){
            if(index== 0){
                return true;
            }
            else return false;
        }

        void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty Nothing to Display");
               return;
            }
            System.out.println("Our stack is given below");
            for(int i=0;i<=index-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(12);
        st.push(14);
        st.push(16);
        st.push(18);
        st.push(20);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("Stack is empty "+st.isEmpty());
//        st.pop();
//        st.display();
//        st.push(22);
    }
}
