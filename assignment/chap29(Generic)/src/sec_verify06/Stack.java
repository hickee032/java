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
				System.out.println("������ ����׿�. ��ü�� �����. null�� ����ؿ�!");
			}
			System.out.println(i + "��° ��ü ��" + stack[i]);
		}
		return null;
	}
}
