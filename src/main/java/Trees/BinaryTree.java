// Supporting class for Binary Tree

package main.java.Trees;

public class BinaryTree {
	TreeNode root;

	public BinaryTree() {
		root = null;
	}
	
	int height(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int lheight = height(node.left);
			int rheight = height(node.right);

			if (lheight > rheight) {
				return lheight + 1;
			} else
				return rheight + 1;
		}

	}
}