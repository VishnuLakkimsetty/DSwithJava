package main.java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInBinaryTreeUsingLevelOrder {
	static BinaryTree tree = new BinaryTree();
	public static void main(String args[]) {
		tree.root = new IntTreeNode(1);
		tree.root.left = new IntTreeNode(2);
		tree.root.right = new IntTreeNode(3);
		tree.root.left.left = new IntTreeNode(4);
		tree.root.right.left = new IntTreeNode(5);

		System.out.println("Level order traversal of binary tree is ");
		LevelOrderTraversalUsingRecursion.printLevelOrder(tree.root);
		System.out.println("Inserting element in level order");
		insertLevelOrder(tree.root,6);
		System.out.println("Level order traversal of binary tree after inserting is ");
		LevelOrderTraversalUsingRecursion.printLevelOrder(tree.root);
	}

	static void insertLevelOrder(IntTreeNode root,int data) {
		if(root==null)
			throw new RuntimeException("Can't insert in empty tree");
		else {
			Queue<IntTreeNode> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()) {
				root = q.peek();
				q.remove();
				
				if(root.left==null) {
					root.left=new IntTreeNode(data);
					break;
				} else
					q.add(root.left);
				
				if(root.right==null) {
					root.right=new IntTreeNode(data);
					break;
				} else
					q.add(root.right);
			}
		}
	}
}
