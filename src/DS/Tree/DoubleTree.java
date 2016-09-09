package DS.Tree;
// http://www.geeksforgeeks.org/double-tree/
public class DoubleTree {
	public static void doubleTree(TreeNode root) {
		TreeNode oldLeft;
		if (root == null) {
			return;
		}
		doubleTree(root.left);
		doubleTree(root.right);

		oldLeft = root.left;
		root.left = new TreeNode(root.val);
		root.left.left = oldLeft;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		doubleTree(root);
		System.out.println(root);
	}
}
/*
 *      2
	   / \
	  1   3
	  
	  	to
	  	
  	   2
      / \
     2   3
    /   /
   1   3
  /
 1 
 
 * 
 * 
 * 
 */