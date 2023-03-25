package sec01_List.exam04_Stack;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		// Queue�� �������̽��̴� --> �����ڰ����� �׷��Ƿ� �ν��Ͻ��� �������Ѵ�.
		// Queue<String> queue = new Queue<String>();
		Queue<String> queue = new LinkedList<String>();

		stack.push("0");
		stack.push("1");
		stack.push("2");

//		queue.offer("0");
//		queue.offer("1");
//		queue.offer("2");
		
		queue.add("0");
		queue.add("1");
		queue.add("2");

		System.out.println("=����=");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=ť=");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
