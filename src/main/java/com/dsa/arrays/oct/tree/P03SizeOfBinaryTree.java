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
public class P03SizeOfBinaryTree {
    Node root;
    public static int sizeOfTree(Node root){
        if (root==null) return 0;
        else {
            return (sizeOfTree(root.left)+sizeOfTree(root.right))+1;
        }

    }
    public static void main(String[] args) {
        P03SizeOfBinaryTree tree=new P03SizeOfBinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println(sizeOfTree(tree.root));
    }

}
