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
public class P02NodeAtKDistance {
    Node root;
    // k=1-->print  left and right
    //k=2
    public static void printNodeAtKDistance(Node root, int k){
        if (root==null) return ;
        if (k==0){
            System.out.println(root.data);
        }else {
            printNodeAtKDistance(root.left,k-1);
            printNodeAtKDistance(root.right,k-1);
        }
    }
    public static void main(String[] args) {
        P02NodeAtKDistance tree=new P02NodeAtKDistance();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        printNodeAtKDistance(tree.root,2);
    }

}
