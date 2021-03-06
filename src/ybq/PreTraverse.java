package ybq;

import java.util.Stack;

public class PreTraverse {

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

//		preTraversRecursion(node[0]);
		preTraverseNoRecursion(node[0]);

		
	}

	public static void preTraverseNoRecursion(TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				System.out.println(node.value);
				stack.push(node);
				node = node.left;
			}
			if (! stack.isEmpty()) {
				node = stack.pop();
				node = node.right;
			}
		}
	}

	public static void preTraversRecursion(TreeNode node) {
		if (node != null) {
			System.out.println(node.value);
			preTraversRecursion(node.left);
			preTraversRecursion(node.right);
		}

	}
}

class TreeNode// 节点结构
{
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int value) {
		this.value = value;
	}
}
