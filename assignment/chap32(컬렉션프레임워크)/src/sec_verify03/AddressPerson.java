package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {
	private ArrayList<Person> db = new ArrayList<Person>();

	public AddressPerson() {
		System.out.println("데이터 베이스를 생성합니다.");
	}

	public void print() {
		System.out.println("-------------------------------------------");
		for (int i = 0; i < db.size(); i++) {
			System.out.println(
					"이름: " + db.get(i).getName() + " 나이: " + db.get(i).getAge() + " 연락처: " + db.get(i).getHandPhone());
		}
		System.out.println("-------------------------------------------");
	}

	public void insert(Person p) {
		int count = 0;
		for (int i = 0; i < db.size(); i++) {

			if (db.get(i).getName() == p.getName()) {
				System.out.println(p.getName() + "씨는 이미 등록된 회원입니다.");
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
		System.out.println(name + "고객을 삭제 하였습니다.");
	}

	public void update(String name, Person p) {
		int count = 0;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i).getName() == name) {
				System.out.println(name + "씨를 업데이트합니다.");
				db.set(i, p);
				count++;
			}
		}
		if (count == 0) {
			System.out.println(name + "씨는 없습니다.");
		}
	}
}
