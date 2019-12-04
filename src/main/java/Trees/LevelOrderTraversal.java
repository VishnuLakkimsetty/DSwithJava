// https://www.geeksforgeeks.org/level-order-tree-traversal/

package main.java.Trees;

public class LevelOrderTraversal {

	static BinaryTree tree = new BinaryTree();

	public static void main(String args[]) {
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		System.out.println("Level order traversal of binary tree is ");
		printLevelOrder(tree.root);
	}

	static void printLevelOrder(TreeNode root) {
		int h = tree.height(root);
		for (int i = 1; i <= h; i++) {
			printGivenLevel(root, i);
		}
	}

	static void printGivenLevel(TreeNode root2, int level) {
		if (root2 == null)
			return;
		if (level == 1)
			System.out.print(root2.data);
		else {
			printGivenLevel(root2.left, level - 1);
			printGivenLevel(root2.right, level - 1);
		}

	}

}
