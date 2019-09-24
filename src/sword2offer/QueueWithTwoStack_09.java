package sword2offer;

import java.util.Stack;

public class QueueWithTwoStack_09 {

	public static void main(String[] args) {

		QueueWithTwoStack_09 qwts = new QueueWithTwoStack_09();
		qwts.appendTail(1);
		qwts.appendTail(2);
		qwts.appendTail(3);
		qwts.appendTail(4);

		System.out.println(qwts.stack1);
		System.out.println(qwts.stack2);
		System.out.println("FIFO");

		System.out.println(qwts.deleteHead());
		System.out.println(qwts.deleteHead());
		System.out.println(qwts.deleteHead());
		System.out.println(qwts.deleteHead());

		/*
		 * Stack<Integer> stack = new Stack<Integer>(); stack.push(1); stack.push(2);
		 * stack.push(3); System.out.println(stack.pop());
		 * System.out.println(stack.pop()); System.out.println(stack.pop());
		 */
	}

	public void appendTail(Integer i) {
		stack1.push(i);
	}

	public Integer deleteHead() {
		if (stack2.size() > 0) {
			return stack2.pop();
		} else {
			while (stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}

	}

	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();

}
