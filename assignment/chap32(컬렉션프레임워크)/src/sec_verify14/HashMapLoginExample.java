package sec_verify14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pass = sc.next();

			if (map.containsKey(id)) {
				// System.out.println(map.get(id));
				if (map.get(id).equals(pass)) {
					System.out.println(id + "���� �α��� �߽��ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ ����");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. ");
			}
		}
		sc.close();
	}

}
