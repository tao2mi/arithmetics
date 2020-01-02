package sword2offer;

import java.util.Stack;

public class PrintListInReversedOrder_06 {
	
	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		//m1(n1);
		m2(n1);
	}
	
	static void m1(ListNode n) {
		Stack<Integer> stack = new Stack<Integer>();
		while (n != null) {
			stack.add(n.v);
			n = n.next;
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
	
	static void m2(ListNode n) {
		if (n != null) {
			m2(n.next);
			System.out.println(n.v);
		}
	}

	static class ListNode {
		
		public ListNode(int v) {
			this.v = v;
		}
		
		int v;
		ListNode next;
	}

}


