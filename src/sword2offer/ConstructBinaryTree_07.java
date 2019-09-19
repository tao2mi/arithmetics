package sword2offer;

public class ConstructBinaryTree_07 {
	
	public static void main(String[] args) {
		int[] pre = {0, 1, 3, 7, 8, 4, 9, 10, 2, 5, 6};
		int[] in = {7,3, 8, 1, 9, 4, 10, 0, 5, 2, 6};
		TreeNode root = constructBinaryTree(pre, 0, 10, in, 0, 10, 11);
		/*
		 * int[] pre = {0, 1, 2}; int[] in = {1, 0, 2}; TreeNode root =
		 * constructBinaryTree(pre, 0, 2, in, 0, 2, 3);
		 */
		System.out.println(root);
	}
	
	public static TreeNode constructBinaryTree(int[] preOrder, int indexPreStart, int indexPreEnd,
			int[] inOrder, int indexInStart, int indexInEnd, int length) {
		if (length == 0) {
			return null;
		}
		if (length == 1) {
			TreeNode root = new TreeNode();
			root.value = preOrder[indexPreStart];
			return root;
		}
		TreeNode root = new TreeNode();
		root.value = preOrder[indexPreStart];
		
		int indexInOrder = 0;
		while (indexInOrder <= indexInEnd && inOrder[indexInOrder] != root.value) {
			indexInOrder++;
		}
		int leftLength = indexInOrder - indexInStart;
		int rightLength = indexInEnd - indexInOrder;
		if (leftLength > 0) {
			root.left = constructBinaryTree(preOrder, indexPreStart+1, indexPreStart+leftLength, inOrder, indexInStart, indexInStart+leftLength-1, leftLength);
		}
		if (rightLength > 0) {
			root.right = constructBinaryTree(preOrder, indexPreStart+1+leftLength, indexPreEnd, inOrder, indexInOrder+1, indexInEnd, rightLength);
		}
		
		return root;
	}
	
	static class TreeNode// 节点结构
	{
		int value;
		TreeNode left;
		TreeNode right;

		TreeNode(int value) {
			this.value = value;
		}
		
		TreeNode() {
		}
	}

}
