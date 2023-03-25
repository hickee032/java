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
		return (this.name + this.age).hashCode(); // 하위 호환을 위해서 사용하는 것
		// return Objects.hash(this.name,this.age); //신규 새발시에 사용
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
