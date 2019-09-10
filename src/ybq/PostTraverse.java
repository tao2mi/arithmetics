package ybq;

import java.util.Stack;

public class PostTraverse {

	public static void main(String[] args) {
		TreeNode[] node = new TreeNode[10];// 以数组形式生成一棵完全二叉树
		for (int i = 0; i < 10; i++) {
			node[i] = new TreeNode(i);
		}
		for (int i = 0; i < 10; i++) {
			if (i * 2 + 1 < 10)
				node[i].left = node[i * 2 + 1];
			if (i * 2 + 2 < 10)
				node[i].right = node[i * 2 + 2];
		}

//		postTraversRecursion(node[0]);
		postTraverseNoRecursion(node[0]);

	}

	public static void postTraverseNoRecursion(TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();

		stack.push(node);

		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			stack2.push(cur);
			if (null != cur.left) {
				stack.push(cur.left);
			}
			if (null != cur.right) {
				stack.push(cur.right);
			}
		}

		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop().value);
		}
	}

	public static void postTraversRecursion(TreeNode node) {
		if (node != null) {
			postTraversRecursion(node.left);
			postTraversRecursion(node.right);
			System.out.println(node.value);
		}

	}
}
