// Supporting class for Binary Tree

package main.java.Trees;

public class BinaryTree {
	IntTreeNode root;

	public BinaryTree() {
		root = null;
	}
	
	int height(IntTreeNode node) {
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