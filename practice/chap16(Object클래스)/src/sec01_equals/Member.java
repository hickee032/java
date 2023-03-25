package sec01_equals;

public class Member {
	String id;

	// ������
	public Member(String id) {
		this.id = id;
	}

	// �Ű����� object�� �ִ� ���ǹ̴� �����ϱ�?
	@Override
	public boolean equals(Object obj) {

		System.out.println("equals() ȣ��");

		// Ÿ�Ժ�ȯ�� ���� ���� �˾ƺ��� ���� instanceof ���
		if (obj instanceof Member) {
			Member member = (Member) obj; // �ٿ�ĳ������ �ݵ�� ����ȯ �ڵ尡 �ʿ��ϴ�.
			// ���� ������ ���� ���ǹ� ����.
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
