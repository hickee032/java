package sec_verify02;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		System.out.println("Member�� toString()�� ȣ���� ��� :" + this.id + ": " + this.name);
		return name;
	}

}
