package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {
	private ArrayList<Person> db = new ArrayList<Person>();

	public AddressPerson() {
		System.out.println("������ ���̽��� �����մϴ�.");
	}

	public void print() {
		System.out.println("-------------------------------------------");
		for (int i = 0; i < db.size(); i++) {
			System.out.println(
					"�̸�: " + db.get(i).getName() + " ����: " + db.get(i).getAge() + " ����ó: " + db.get(i).getHandPhone());
		}
		System.out.println("-------------------------------------------");
	}

	public void insert(Person p) {
		int count = 0;
		for (int i = 0; i < db.size(); i++) {

			if (db.get(i).getName() == p.getName()) {
				System.out.println(p.getName() + "���� �̹� ��ϵ� ȸ���Դϴ�.");
				count++;
			}
		}

		if (count == 0) {
			db.add(p);
		}
	}

	public void delete(String name) {

		for (int i = 0; i < db.size(); i++) {
			if (db.get(i).getName() == name) {
				db.remove(i);
			}
		}
		System.out.println(name + "���� ���� �Ͽ����ϴ�.");
	}

	public void update(String name, Person p) {
		int count = 0;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i).getName() == name) {
				System.out.println(name + "���� ������Ʈ�մϴ�.");
				db.set(i, p);
				count++;
			}
		}
		if (count == 0) {
			System.out.println(name + "���� �����ϴ�.");
		}
	}
}
