package sec02_Set.exam02_UserDefineHashSet;

import java.util.Objects;

public class Member {

	private String name;
	private int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		return (this.name + this.age).hashCode(); // ���� ȣȯ�� ���ؼ� ����ϴ� ��
		// return Objects.hash(this.name,this.age); //�ű� ���߽ÿ� ���
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return ((member.name.equals(this.name)) && (member.age==(this.age)));
		}
		return false;
	}

}
