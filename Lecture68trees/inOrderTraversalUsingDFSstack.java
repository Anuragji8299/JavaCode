package Lecture68trees;

import java.util.ArrayList;
import java.util.Stack;

public class inOrderTraversalUsingDFSstack {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val ){
            this.val=val;
        }
    }

    public static ArrayList<Integer> inOrderTraversalUsingStack(Node root){

        ArrayList<Integer> arr=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        if(root==null) return arr;

        st.push(root);
        while(st.size()>0) {
            Node temp = st.peek();
            if (temp.left != null) {

                st.push(temp.left);
                temp.left=null;

        }
            else{
                st.pop();
               arr.add(temp.val);
                if(temp.right!=null){
                    st.push(temp.right);
                    temp.right=null;
                }
            }
        }

return arr;
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(20);
        Node b=new Node(30);
        root.left=a;
        root.right=b;
        Node c=new Node(40);
        Node d=new Node(50);
        a.left=c;
        a.right=d;
        Node e=new Node(60);

        b.right=e;
        ArrayList<Integer> arr=inOrderTraversalUsingStack(root);
        System.out.println(arr);
    }
}
