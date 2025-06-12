package BasicOfQueues;

public class queueImplementationUsingArray {

    public static class arrayImplementation{
        int f=-1;
        int r=-1;
        int size=0;
        int[]arr= new int[10];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                ++r;
                ++f;
                arr[r]=val;
            }
            else{
                arr[++r]=val;
            }
 size++;
        }

        public int remove(){
            if(f==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                size--;
                return arr[f++];
            }
        }
        public void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public int peek(){
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0) return true;

            return false;
        }
    }

    public static void main(String[] args) {

        arrayImplementation queue=new arrayImplementation();
        System.out.println(queue.isEmpty());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Removed element is "+queue.remove());
        queue.display();
        System.out.println();
        System.out.println("The size of queue is "+queue.size);
    }
}
