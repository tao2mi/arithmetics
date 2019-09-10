package ybq;

import java.util.LinkedList;

public class LevelTraverse {

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

		levelTraverse(node[0]);

		
	}

	public static void levelTraverse(TreeNode node) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		while (! queue.isEmpty()) {
			TreeNode cur = queue.poll();
			System.out.println(cur.value);
			if (null != cur.left) {
				queue.add(cur.left);
			}
			if (null != cur.right) {
				queue.add(cur.right);
			}
		}
	}

}
