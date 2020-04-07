// https://www.geeksforgeeks.org/print-left-view-binary-tree/
package main.java.Trees;

public class LeftView {
	static int maxLevel = 0;
	
	public static void main(String args[]) 
    { 
        /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree(); 
        tree.root = new IntTreeNode(12); 
        tree.root.left = new IntTreeNode(10); 
        tree.root.right = new IntTreeNode(30); 
        tree.root.right.left = new IntTreeNode(25); 
        tree.root.right.right = new IntTreeNode(40); 
  
        leftView(tree.root,1); 
    }

	private static void leftView(IntTreeNode root, int i) {
		if(root == null)
			return;
		
		if(maxLevel<i) {
			System.out.print(" "+root.data);
			maxLevel = i;
		}
		
		leftView(root.left, i+1);
		leftView(root.right, i+1);
	}
}
