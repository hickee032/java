package sec04_thin_clone;

public class Member implements Cloneable {
	String id;
	String name;
	String passward;

	int age;
	boolean adult;
	int[] scores = null;

	public Member(String id, String name, String passward, int age, boolean adult, int[] scores) {
		this.id = id;
		this.name = name;
		this.passward = passward;
		this.age = age;

	}

	// 얕은 복제를 한 인스턴스 리턴
	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) this.clone(); // 이 클론은 오브젝트의 클론이다.
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public String toString() {

		return "id" + this.id + "name" + this.name + "password" + this.passward + "age" + this.age + "adult"
				+ this.adult + "score" + this.scores;
	}

}
