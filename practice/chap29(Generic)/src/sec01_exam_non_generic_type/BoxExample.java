package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("ȫ�浿"); //��ĳ���� ����ȯ���� ���� : String --> Object

		String name = (String)box.getObject(); //�ٿ�ĳ���� ����ȯ���� �Ұ��� : Object --> String
		System.out.println(name);
	}

}
