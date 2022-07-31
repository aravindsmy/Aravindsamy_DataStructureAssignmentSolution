/**
 * 
 */
package com.greatlearning.bst2st;

import com.greatlearning.bst2st.BSTtoSkewed.Node;

/**
 * @author aravi
 *
 */
public class Driver {

	public static Node node;
	static Node lastNode;
	static Node headNode;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver.node = new Node(50);
		Driver.node.left = new Node(30);
		Driver.node.right = new Node(60);
		Driver.node.left.left = new Node(10);
		Driver.node.right.right = new Node(55);

		BSTtoSkewed bsTtoSkewed = new BSTtoSkewed();
		bsTtoSkewed.toSkewed(node); // converts BST to skewed tree
		bsTtoSkewed.traverseSkewed(headNode);
	}

}
