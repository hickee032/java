package sec01_List.exam04_Stack;

import java.util.Stack;

public class StackEx {

	public static Stack back = new Stack();// �ڷΰ���
	public static Stack forward = new Stack();// ������ ����

	public static void main(String[] args) {

		// Stack �׸��� �׷�����

		goURL("1.���̹�");
		goURL("2.����");
		goURL("3.����Ʈ");
		goURL("4.����");

		print();

		goBack();
		System.out.println("--�ڷΰ��� ��ư ���� ��--");
		print();

		goBack();
		System.out.println("--�ڷΰ��� ��ư ���� ��--");
		print();

		goforward();
		System.out.println("--������ ���� ��ư ���� ��--");
		print();

		goURL("5.�߾�");
		System.out.println("���ο� ����Ʈ �̵�");
		print();

	}

	// �������� �̵�
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) {
			forward.clear();
		}
	}

	// ���� �������� �̵�
	public static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}

	// �� �������� �̵�
	public static void goforward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}

	// ���� ȭ�� ���� ���
	public static void print() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("����ȭ�� : " + back.peek() + "�Դϴ�.");
		System.out.println();
	}
}
