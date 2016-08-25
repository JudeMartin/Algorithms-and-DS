package DS.Tree;


public class LinkNodes {

	public static void connect(TreeLinkNode root) {
		while (root != null && root.left != null) {
			TreeLinkNode cur = root;
			while (cur != null) {
				cur.left.next = cur.right;
				cur.right.next = cur.next == null ? null : cur.next.left;
				cur = cur.next;
			}
			root = root.left;
		}
	}

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);
		root.right.left = new TreeLinkNode(6);
		root.right.right = new TreeLinkNode(7);
		connect(root);
		TreeLinkNode rootNew = root;
		System.out.println(rootNew);

	}
}
