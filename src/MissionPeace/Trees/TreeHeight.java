public class TreeHeight{
	public int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	public static void main(String[] args){
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		int finalHeight = Math.Max(leftRight,rightHeight) + 1;
		
		System.out.println("The Height of the Tree is: " + finalHeight);	
	}
}
