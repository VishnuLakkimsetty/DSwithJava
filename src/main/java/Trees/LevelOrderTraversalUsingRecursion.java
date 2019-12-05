// https://www.geeksforgeeks.org/level-order-tree-traversal/

package main.java.Trees;

public class LevelOrderTraversalUsingRecursion {

	static BinaryTree tree = new BinaryTree();

	public static void main(String args[]) {
		tree.root = new IntTreeNode(1);
		tree.root.left = new IntTreeNode(2);
		tree.root.right = new IntTreeNode(3);
		tree.root.left.left = new IntTreeNode(4);
		tree.root.left.right = new IntTreeNode(5);

		System.out.println("Level order traversal of binary tree is ");
		printLevelOrder(tree.root);
	}

	static void printLevelOrder(IntTreeNode root) {
		int h = tree.height(root);
		for (int i = 1; i <= h; i++) {
			printGivenLevel(root, i);
		}
	}

	static void printGivenLevel(IntTreeNode root2, int level) {
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
