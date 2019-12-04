package main.java.Trees;

public class InsertInBinaryTreeUsingLevelOrder {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		System.out.println("Level order traversal of binary tree is ");
		insertLevelOrder(tree.root);
	}

	static void insertLevelOrder(TreeNode root) {
		

	}
}
