package Lecture68trees;

public class implementation {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val ){
            this.val=val;
        }
    }

    public static int maxHeightSize(Node root){
        if(root==null) return 0;

     return 1+maxHeightSize(root.left)+maxHeightSize(root.right);


    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+"->");
        if(root.left!=null) System.out.print(root.left.val+",");
        if(root.right!=null) System.out.print(root.right.val+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static int maxElement(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a=maxElement(root.left);
        int b=maxElement(root.right);
        return Math.max(root.val,Math.max(a,b));
    }

    public static int maxHeight(Node root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        return 1+Math.max(maxHeight(root.left),maxHeight(root.right));
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
display(root);
        System.out.println("Size of binary tree is: "+maxHeightSize(root));
        System.out.println("Sum of binary tree is: "+sum(root));
        System.out.println("Maximum element of binary tree is: "+maxElement(root));
        System.out.println("Maximum height of binary tree is: "+maxHeight(root));


    }
}
