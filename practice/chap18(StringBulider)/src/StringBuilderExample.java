
public class StringBuilderExample {

	public static void main(String[] args) {
		/* buffer �ӽ� �޸� ����, L1,L2ĳ�� ������ Ȯ��)�� �̿��ϱ� ������ 
		 * ���� �ν��Ͻ� ��� ���� ���� */
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.append("�ڹ�");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());

		sb.insert(0,1);
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());
		
		//StringBuilder,buffer�� replace(0,1,"��ü")�� �ڿ� ���� ���� ���� �ʴ� ��.
		sb.replace(0, 1, "��ü");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
