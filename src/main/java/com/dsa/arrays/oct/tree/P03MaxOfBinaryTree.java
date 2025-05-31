package src.main.java.com.dsa.arrays.oct.tree;
/*
    1
   / \
  2   3
 / \
4   5
distance at k=1 = 2,3
distance at k=2 = 4,5
 */
public class P03MaxOfBinaryTree {
    Node root;
    public static int maxOfTree(Node root){
        /*
        This will fail for some condition
        if (root.left==null || root.right==null) return root.data;
        else {
            return Math.max(maxOfTree(root.left),maxOfTree(root.right));
        }*/
        if (root==null) return Integer.MIN_VALUE;
        else {
            return Math.max(root.data,Math.max(maxOfTree(root.left),maxOfTree(root.right)));
        }


    }
    public static void main(String[] args) {
        P03MaxOfBinaryTree tree=new P03MaxOfBinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(32);
        tree.root.right=new Node(31);
        tree.root.left.left=new Node(24);
        tree.root.left.right=new Node(225);
        System.out.println(maxOfTree(tree.root));
    }

}
