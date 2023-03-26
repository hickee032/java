package sec_verify06;

public class Stack<T> {

	int tos;
	int capacity;
	Object[] stack;

	public Stack(int capacity) {
		stack = new Object[capacity];
	}

	public void push(T item) {
		for (int i = 0; i < stack.length; i++) {
			stack[i] = new Stack<T>(capacity);
		}
	}

	public T pop() {

		for (int i = 0; i < stack.length; i++) {
			if (stack[i] == null) {
				System.out.println("스택이 비었네요. 객체가 없어요. null을 출력해요!");
			}
			System.out.println(i + "번째 객체 값" + stack[i]);
		}
		return null;
	}
}
