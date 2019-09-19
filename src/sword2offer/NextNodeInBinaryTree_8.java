package sword2offer;

public class NextNodeInBinaryTree_8 {
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode("a");
		TreeNode b = new TreeNode("b");
		TreeNode c = new TreeNode("c");
		TreeNode d = new TreeNode("d");
		TreeNode e = new TreeNode("e");
		TreeNode f = new TreeNode("f");
		TreeNode g = new TreeNode("g");
		TreeNode h = new TreeNode("h");
		TreeNode i = new TreeNode("i");
		
		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		b.parent = a;
		
		c.left = f;
		c.right = g;
		c.parent = a;
		
		d.parent = b;
		
		e.left = h;
		e.right = i;
		e.parent = b;
		
		f.parent = c;
		
		g.parent = c;
		
		h.parent = e;
		
		i.parent = e;
		
		
		TreeNode next = findNext(i);
		
		System.out.println(next == null ? "null" : next.value);
	}
	
	public static TreeNode findNext(TreeNode root) {
		
		if (root == null) {
			return null;
		}
		
		TreeNode p = root;
		if (p.right != null) {
			p = p.right;
			while (p.left != null) {
				p = p.left;
			}
		} else if (p.parent != null) {
			TreeNode cur = p;
			TreeNode parent = p.parent;
			while (parent != null && parent.right == cur) {
				cur = parent;
				parent = parent.parent;
			}
			p = parent;
		} else {
			p = null;
		}
		
		return p;
	}
	
	static class TreeNode// �ڵ�ṹ
	{
		String value;
		TreeNode left;
		TreeNode right;
		TreeNode parent;

		TreeNode(String value) {
			this.value = value;
		}
		
		TreeNode() {
		}
	}

}
