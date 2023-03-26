package StringStack;

import java.util.Scanner;

public class StringStack implements Stack {

	Scanner scan = new Scanner(System.in);

	private String[] arr;
	private int i;

	@Override // arr�迭�� ����
	public int length() {
		System.out.print("���ÿ��� �Է�");
		i = scan.nextInt();
		scan.nextLine();
		arr = new String[i];
		System.out.println(i + "���� ���ÿ����� �����Ǿ����ϴ�.");
		return i;
	}

	@Override // arr �迭���� ����
	public Object pop() {
//		System.out.println("������ ���Լ��� �����Դϴ�.(LIFO)\r\n" + "���ÿ� �ִ� ������� ����մϴ�.");
//
//		for (int i = arr.length-1; i >=0 ; i--) {
//			System.out.println((i+1) + "���ÿ� ����� ������ ����մϴ�.");
//			System.out.println(arr[i]);}
		if (this.i == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		this.i--;// String �迭���� �������� ������ �ε��� ����
		return this.arr[this.i];
	}

	@Override // arr�迭�� ���� �Է� ����
	public void push(Object o) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("�����ϰ� ���� ������ �Է��ϼ��� : ");
//			arr[i] = scan.nextLine();
//			System.out.println(arr[i] + " �� ���ÿ� ���� �Ǿ����ϴ�.");
//			System.out.println(arr[i] + " �� " + (i+1) + " �� ����");
//		}

		// String Ÿ�� üũ
		if (this.i == this.arr.length) {
			System.out.println("������ �����÷ο� �߻�.");
			return;
		}

		if (o instanceof String) {
			String str = (String) o; // ���� ĳ���� = �ٿ� ĳ����
			this.arr[this.i] = str; // String []���ٰ� ����.
			this.i++;
		}

	}

	public String[] getArr() {
		return arr;
	}

}
