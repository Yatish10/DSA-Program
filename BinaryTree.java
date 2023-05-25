package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		private TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(8);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		root = first; // root --> first
		first.left = second;
		first.right = third; //second <--- first ---> third
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;
		third.right = seventh;
	}
	/*
	 //Recursive Pre Order binary tree traversal
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	*/
	/*
	//Iterative Pre Order binary tree traversal
	public void preOrder1() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	*/
	/*
	// Recursive In-order Traversal of Binary Tree
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	*/
	/*
	//Iterative In Order binary tree traversal
	public void inOrder1(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}
	*/
	
	/*
	// Recursive post Order Traversal of Binary Tree
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	*/
	/*
	//Iterative Post order Traversal of Binary Tree
	public void postOrder1(TreeNode root) {
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		while(current != null || !stack.isEmpty()) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} 
				else {
						current = temp;
					}
				}
			}
		}
		*/
	
	/*
	//Level Order traversal of Binary tree
	public void levelOrder() {
		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
			queue.offer(temp.left);
		    }
		    if(temp.right != null) {
			queue.offer(temp.right);
		 }
	  }
  }
  */
	
	/*
	//Q. Find the Maximum value in a Binary Tree
	public int findMax() {
		return findMax(root);
	}
	
	public int findMax(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		
		if(left > result) {
			result = left;
		}
		if(right > result) {
			result = right;
		}
		return result;
	}
	*/
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		
		//bt.preOrder(bt.root);
		
		//System.out.println();
		
		//bt.preOrder1();
		
		//bt.inOrder(bt.root);
		
		//System.out.println();
		
		//bt.inOrder1(bt.root);
		 
		//bt.postOrder(bt.root);
		
		//System.out.println();
		 
		//bt.postOrder1(bt.root);
		
		//bt.levelOrder();
		
		//System.out.println(bt.findMax());

	}

}
