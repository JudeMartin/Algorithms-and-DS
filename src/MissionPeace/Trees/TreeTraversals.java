package MissionPeace.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversals{
	TreeNode root;
	
	public TreeTraversals(){
		root = null;
	}
	
	public void preOrderRecursive(TreeNode root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);	
	}
	public void preOrderIterative(TreeNode root){
		if(root == null){
			return;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			root = s.pop();	
			System.out.print(root.data + " ");
			if(root.right != null){
				s.push(root.right);
			}
			if(root.left != null){
				s.push(root.left);
			}
		}
	}
	public void inOrderRecursive(TreeNode root){
		if(root == null){
			return;
		}	
		inOrderRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderRecursive(root.right);
	}	
	public void postOrderRecursive(TreeNode root){
		if(root == null){
			return;
		}
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data + " ");
	}

	public void reverseLevelOrderTraversal(TreeNode root) {

		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		Stack<TreeNode> s = new Stack<>();

		q.offer(root);
		while (!q.isEmpty()) {
			root = q.poll();
			if (root.right != null) {
				q.offer(root.right);
			}
			if (root.left != null) {
				q.offer(root.left);
			}
			s.push(root);
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
		}

	}

	public void LevelorderIteravtive(TreeNode root){}
	public static void main(String[] args){
		
		TreeTraversals tree = new TreeTraversals();
			tree.root = new TreeNode(3);
			tree.root.left = new TreeNode(2);
			tree.root.right = new TreeNode(4);
			tree.root.left.left = new TreeNode(5);
			tree.root.left.right = new TreeNode(7);

			System.out.println("\n");
			
			System.out.println("Recursive PreOrder Traversal: ");
			tree.preOrderRecursive(tree.root);
			
			System.out.println("\n");
						
			System.out.println("Iterative PreOrder Traversal: ");
			tree.preOrderIterative(tree.root);
			
			System.out.println("\n");
			
			System.out.println("Recursive InOrder Traversal: ");
			tree.inOrderRecursive(tree.root);
			
			System.out.println("\n");
				
			System.out.println("Reverse Level Order Traversal: ");
			tree.reverseLevelOrderTraversal(tree.root);

			System.out.println(" ");


	}
		
}
