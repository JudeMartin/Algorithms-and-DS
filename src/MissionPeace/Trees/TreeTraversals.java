package MissionPeace.Trees;

public class TreeTraversals{
	TreeNode root;
	
	public TreeTraversals(){
		root = null;
	}
	
	public void preOrderRecursive(TreeNode root){
		if(root == null){
			return;
		}
		System.out.print(root.data+ " ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);	
	}
	public void inOrderRecursive(TreeNode root){}	
	public void postOrderRecursive(TreeNode root){}
	public void LevelorderIteravtive(TreeNode root){}
	public static void main(String[] args){
		
		TreeTraversals tree = new TreeTraversals();
			tree.root = new TreeNode(3);
			tree.root.left = new TreeNode(2);
			tree.root.right = new TreeNode(4);
			tree.root.left.left = new TreeNode(5);
			tree.root.left.right = new TreeNode(7);
			tree.preOrderRecursive(tree.root);
	}
}
