package sec01_List.exam04_Stack;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		// Queue는 인터페이스이다 --> 생성자가없다 그러므로 인스턴스를 생성못한다.
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

		System.out.println("=스택=");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=큐=");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
