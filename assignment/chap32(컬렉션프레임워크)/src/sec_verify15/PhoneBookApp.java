package sec_verify15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {

	final int INSERT = 1;
	final int DELETE = 2;
	final int SEARCH = 3;
	final int SHOWALL = 4;
	final int EXIT = 5;
	private Scanner scanner;

	private HashMap<String, Phone> map = new HashMap<String, Phone>();

	public PhoneBookApp() {
		scanner = new Scanner(System.in);
	}

	public void run() {

		System.out.println("--------------------------------------------\r\n" + "��ȭ��ȣ ���� ���α׷��� �����մϴ�.\r\n"
				+ "--------------------------------------------\r\n" + "1 : ����, 2 : ����, 3 : ã��, 4. ��ü ����, 5. ���� >>");
		int input = scanner.nextInt();

		if (input == 1) {
			insert();
			run();
		}
		if (input == 2) {
			delete();
			run();
		}
		if (input == 3) {
			search();
			run();
		}
		if (input == 4) {
			showall();
			run();
		}
		if (input == 5) {
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
	}

	public void insert() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		if (map.containsKey(name)) {
			System.out.println(name + "�� �ִµ� ~~ ");
		} else {
			System.out.print("�ּ�>>");
			String add = scanner.next();
			System.out.print("��ȭ��ȣ>>");
			String phone = scanner.next();

			map.put(name, new Phone(name, add, phone));
			System.out.println(name + "����Ǿ����ϴ�.");
		}
	}

	public void delete() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		map.remove(name);
		System.out.println(name + "�����Ǿ����ϴ�.");

	}

	public void search() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		if (map.containsKey(name)) {
			System.out.println(name + "�̹� ��� �Ǿ����ϴ�.");
		} else {
			System.out.println(name + "��ϵ��� �ʾҽ��ϴ�.");
		}
	}

	public void showall() {
		System.out.println("���� ����Ǿ� �ִ� �� ���� ����Ʈ�Դϴ�.");
		Set<String> keyset = map.keySet();
		Iterator<String> keyiIterator = keyset.iterator();
		while (keyiIterator.hasNext()) {
			String key = keyiIterator.next();
			System.out.println("�̸� : " + map.get(key).getName());
			System.out.println("�ּ� : " + map.get(key).getAddress());
			System.out.println("��ȭ��ȣ : " + map.get(key).getTelNum());
		}

	}

//		System.out.println("--------------------------------------------\r\n" + "��ȭ��ȣ ���� ���α׷��� �����մϴ�.\r\n"
//				+ "--------------------------------------------\r\n" + "1 : ����, 2 : ����, 3 : ã��, 4. ��ü ����, 5. ���� >>");
//		int input = scanner.nextInt();
//		switch (input) {
//		case 1:
//			System.out.print("�̸�>>");
//			String name = scanner.next();
//			System.out.print("�ּ�>>");
//			String add = scanner.next();
//			System.out.print("��ȭ��ȣ>>");
//			String phone = scanner.next();
//			map.put(name, new Phone(name, add, phone));
//			System.out.println(name + "����Ǿ����ϴ�.");
//			
//			
//			break;
//		case 2:
//			String Dname = scanner.next();
//			map.remove(Dname);
//			System.out.println(Dname+"�����Ǿ����ϴ�.");
//
//			break;
//		case 3:
//
//			break;
//		case 4:
//
//			break;
//		case 5:
//
//			break;
//
//		}

}
