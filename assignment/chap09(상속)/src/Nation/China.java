package Nation;

public class China extends Asia {

	String country;

	@Override
	public String toString() {

		String str = "���� ��� �ִ� ���� : " + this.country + "�̸�,�� �����" + super.country + "�� ���մϴ�.";

		return str;
	}

}
