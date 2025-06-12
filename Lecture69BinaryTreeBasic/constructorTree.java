package Lecture69BinaryTreeBasic;

import java.util.LinkedList;
import java.util.Queue;

public class constructorTree {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }

    public static Node constructorTreeWithBfs(String[]arr){

        int val=Integer.parseInt(arr[0]);
        Node root=new Node(val);
        int n= arr.length;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1) {
            Node l = new Node(0);
            Node r = new Node(0);
            Node temp = q.remove();
            if (arr[i].equals("")){

                l=null;
            i++;
            }
            else{
                int valL = Integer.parseInt(arr[i++]);
                l.val=valL;
                q.add(l);

            }
            if (arr[i+1].equals("")){

                r=null;
                i++;
            }
            else{
                int valR = Integer.parseInt(arr[i++]);
                r.val=valR;
                q.add(r);

            }

            temp.left = l;
            temp.right = r;
        }
return root;
    }


    public static void main(String[] args) {
String [] arr={"1","2","3","4","","5","6","","7","","8"};


    }
}
