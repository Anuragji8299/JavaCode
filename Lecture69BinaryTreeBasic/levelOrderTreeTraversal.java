package Lecture69BinaryTreeBasic;


import java.util.*;

public class levelOrderTreeTraversal {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val ){
            this.val=val;
        }
    }

//    public static void nthLevel(Node root, int level, ArrayList<Integer> arr){
//        if(root==null) return;
//        if(level==1){
//           arr.add(root.val);
//            return;
//        }
//        nthLevel(root.left,level-1,arr);
//        nthLevel(root.right,level-1,arr);
//
//    }

    public static void nthLevel(Node root, int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,level-1);
        nthLevel(root.right,level-1);

    }

    public static int height(Node root){
        if(root==null ||(root.left==null&&root.right==null)) return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }

    public static ArrayList<ArrayList<Integer>>  levelOrderTraversal(Node root){

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int level=1+height(root);
        if(root==null) return ans;
        for(int i=1;i<=level;i++){
            ArrayList<Integer> arr=new ArrayList<>();
//            nthLevel(root,i,arr);
            ans.add(arr);
        }

return ans;
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
            }
            else{
                int valL = Integer.parseInt(arr[i]);
                l.val=valL;
                q.add(l);

            }
            if (arr[i+1].equals("")){

                r=null;

            }
            else{
                int valR = Integer.parseInt(arr[i+1]);
                r.val=valR;
                q.add(r);

            }

            temp.left = l;
            temp.right = r;
            i=i+2;
        }
return root;
    }


    public static void main(String[] args) {
        String [] arr={"1","2","3","4","","5","6","","7","","","8","","","","9",""};
        Node root=constructorTreeWithBfs(arr);

   int level=height(root)+1;
//        ArrayList<ArrayList<Integer>> ans=levelOrderTraversal(root);

//        System.out.println(ans);
        for(int i=0;i<=level;i++){
            nthLevel(root,i);
            System.out.println();

        }
    }




}
