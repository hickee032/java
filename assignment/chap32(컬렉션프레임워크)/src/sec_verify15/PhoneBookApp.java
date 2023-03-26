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

		System.out.println("--------------------------------------------\r\n" + "전화번호 관리 프로그램을 시작합니다.\r\n"
				+ "--------------------------------------------\r\n" + "1 : 삽입, 2 : 삭제, 3 : 찾기, 4. 전체 보기, 5. 종료 >>");
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
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
	}

	public void insert() {
		System.out.print("이름>>");
		String name = scanner.next();
		if (map.containsKey(name)) {
			System.out.println(name + "님 있는데 ~~ ");
		} else {
			System.out.print("주소>>");
			String add = scanner.next();
			System.out.print("전화번호>>");
			String phone = scanner.next();

			map.put(name, new Phone(name, add, phone));
			System.out.println(name + "저장되었습니다.");
		}
	}

	public void delete() {
		System.out.print("이름>>");
		String name = scanner.next();
		map.remove(name);
		System.out.println(name + "삭제되었습니다.");

	}

	public void search() {
		System.out.print("이름>>");
		String name = scanner.next();
		if (map.containsKey(name)) {
			System.out.println(name + "이미 등록 되었습니다.");
		} else {
			System.out.println(name + "등록되지 않았습니다.");
		}
	}

	public void showall() {
		System.out.println("현재 저장되어 있는 고객 정보 리스트입니다.");
		Set<String> keyset = map.keySet();
		Iterator<String> keyiIterator = keyset.iterator();
		while (keyiIterator.hasNext()) {
			String key = keyiIterator.next();
			System.out.println("이름 : " + map.get(key).getName());
			System.out.println("주소 : " + map.get(key).getAddress());
			System.out.println("전화번호 : " + map.get(key).getTelNum());
		}

	}

//		System.out.println("--------------------------------------------\r\n" + "전화번호 관리 프로그램을 시작합니다.\r\n"
//				+ "--------------------------------------------\r\n" + "1 : 삽입, 2 : 삭제, 3 : 찾기, 4. 전체 보기, 5. 종료 >>");
//		int input = scanner.nextInt();
//		switch (input) {
//		case 1:
//			System.out.print("이름>>");
//			String name = scanner.next();
//			System.out.print("주소>>");
//			String add = scanner.next();
//			System.out.print("전화번호>>");
//			String phone = scanner.next();
//			map.put(name, new Phone(name, add, phone));
//			System.out.println(name + "저장되었습니다.");
//			
//			
//			break;
//		case 2:
//			String Dname = scanner.next();
//			map.remove(Dname);
//			System.out.println(Dname+"삭제되었습니다.");
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
