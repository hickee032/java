package Document;

public class Document {

	static int count = 0;
	String name = "�������";

	public Document() {
		count++;

		// System.out.println("���� "+ name +count+" �� �����Ǿ����ϴ�.");
	}

	public Document(String name) {
		this.name = name;
		// System.out.println("���� "+name+" �� �����Ǿ����ϴ�.");
	}

	@Override
	public String toString() {
		String str = "���� " + name + count + " �� �����Ǿ����ϴ�.";
		return str;
	}
}
