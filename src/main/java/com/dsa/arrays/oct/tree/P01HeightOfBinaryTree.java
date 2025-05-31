package src.main.java.com.dsa.arrays.oct.tree;

import com.sun.source.tree.BinaryTree;

/*
    1
   / \
  2   3
 / \
4   5
op- 3
 */
public class P01HeightOfBinaryTree {

    Node root;
    public int height(Node root){
        if (root==null) return 0;
        else {
            return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public static void main(String[] args) {
        P01HeightOfBinaryTree binaryTree=new P01HeightOfBinaryTree();
        binaryTree.root=new Node(1);
        binaryTree.root.left=new Node(2);
        binaryTree.root.right=new Node(3);
        binaryTree.root.left.left=new Node(4);
        binaryTree.root.right=new Node(5);
        System.out.println("Height of tree "+binaryTree.height(binaryTree.root));
    }

}
class Node {
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
