package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class longStringSearch {
	
	String com = null;
	
	Scanner sc = new Scanner(System.in);

	private ArrayList<String> stringList;

	public longStringSearch(int input) {

		System.out.print("��� �̸��� �Է��Ͻǲ�����? >>");
		input = sc.nextInt();
		System.out.println(input + "��ŭ�� ArrayList�� �����Ǿ����ϴ�.");
		stringList = new ArrayList<String>(input);

		for (int i = 0; i < input; i++) {
			System.out.print((i + 1) + "��° �̸��� �Է��ϼ���>>");
			String name = sc.next();
			stringList.add(name);
		}
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println();
		System.out.println("ArrayList�� ��� �ִ� ��� �̸��� ����մϴ�.");

		for (int i = 0; i < input; i++) {

			System.out.println((i + 1) + "��° ArrayList��ü �� : " + stringList.get(i));
		}

		for (int i = 0; i < stringList.size(); i++) {
			com = stringList.get(0);
			if (com.length() < stringList.get(i).length()) {
				com = stringList.get(i);
			}
			
		}
		System.out.println("���� �� �̸��� "+com+"�Դϴ�.");

	}

}
