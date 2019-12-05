package main.java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {
	static BinaryTree tree = new BinaryTree();

	public static void main(String args[]) {
		tree.root = new IntTreeNode(1);
		tree.root.left = new IntTreeNode(2);
		tree.root.right = new IntTreeNode(3);
		tree.root.left.left = new IntTreeNode(4);
		tree.root.left.right = new IntTreeNode(5);

		System.out.println("Level order traversal of binary tree is ");
		printLevelOrderUsingQueue(tree.root);
	}

	static void printLevelOrderUsingQueue(IntTreeNode root) {
		Queue<IntTreeNode> q = new LinkedList<IntTreeNode>();
		if(root==null)
			return;
		q.add(root);
		
		while(!q.isEmpty()) {
			root=q.peek();
			System.out.print(q.poll().data+"");
			if(root.left!=null)
				q.add(root.left);
			
			if(root.right!=null) 
				q.add(root.right);
		}
	}
}
