package Lecture68trees;

import java.util.LinkedList;
import java.util.Queue;

public class preInPost {

    public static class Node{
                int val;
        Node left;
        Node right;

        public Node(int val ){
            this.val=val;
        }
    }

    public static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void InOrderTraversal(Node root){
        if(root==null) return;

        InOrderTraversal(root.left);
        System.out.print(root.val+" ");
        InOrderTraversal(root.right);
    }

    public static void PostOrderTraversal(Node root){
        if(root==null) return;

        PostOrderTraversal(root.left);

        PostOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static void nthlevelTraversal(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");   //prints only the desired level
            return;
        }
        nthlevelTraversal(root.left,n-1);
        nthlevelTraversal(root.right,n-1);

    }

    //level order traversal (BFS) breadth first search

    public static void bfs(Node root){
        Queue<Node> qu=new LinkedList<>();
        if(root!=null) qu.add(root);
        while (qu.size()>0){
            Node temp= qu.peek();
            if(temp.left!=null) qu.add(temp.left);
            if(temp.right!=null) qu.add(temp.right);
            System.out.print(temp.val+" ");
            qu.remove();
        }
        System.out.println();
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
//preOrderTraversal(root);
//        System.out.println();
//        InOrderTraversal(root);
//        System.out.println();
//        PostOrderTraversal(root);
//        System.out.println();
//nthlevelTraversal(root,1);
bfs(root);




    }
}
