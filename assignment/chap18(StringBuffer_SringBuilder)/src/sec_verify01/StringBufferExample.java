package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This");
		System.out.println("���� ��Ʈ������ sb ��� : " + sb);
		System.out.println(sb.hashCode());

		sb.append(" is pencil");
		System.out.println("������ ��Ʈ������ sb ��� : " + sb);
		
		sb.insert(8, "my ");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);

	}

}
