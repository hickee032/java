package Nation;

public class Korea extends Asia {

	String country;

	@Override
	public String toString() {

		String str = "���� ��� �ִ� ���� : " + this.country + "�̸�,�� �����" + super.country + "�� ���մϴ�.";

		return str;
	}

}
