package com.greatlearning.bst2st;

public class BSTtoSkewed extends Driver {

	static class Node {
		int data;

		Node left, right;

		Node(int data) {

			this.data = data;
			this.right = null;
			this.left = null;

		}
	}
	
	// n function to convert the BST to Skewed tree in increasing order
	public void toSkewed(Node root) {

		if (root == null) {
			return;

		}
		toSkewed(root.left); // recursion of left subtree

		Node rightNode = root.right;

		// n condition to check if head is defined in skewed tree
		if (headNode == null) {
			headNode = root;
			root.left = null;
			lastNode = root;
		} else {
			lastNode.right = root;
			root.left = null;
			lastNode = root;
		}

		toSkewed(rightNode); // recursion of right sub tree
	}
	// traverse skewed tree and print the nodes

	public void traverseSkewed(Node root) {

		if (root == null) {
			return;

		}
		System.out.println(root.data + " ");
		traverseSkewed(root.right);
	}

}
