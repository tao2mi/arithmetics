package ybq;

import java.util.Stack;

public class MidTraverse {

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

//		midTraversRecursion(node[0]);
		midTraverseNoRecursion(node[0]);

		
	}

	public static void midTraverseNoRecursion(TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			if (! stack.isEmpty()) {
				node = stack.pop();
				System.out.println(node.value);
				node = node.right;
			}
		}
	}

	public static void midTraversRecursion(TreeNode node) {
		if (node != null) {
			midTraversRecursion(node.left);
			System.out.println(node.value);
			midTraversRecursion(node.right);
		}

	}
}

