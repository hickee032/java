package sec_verify01;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> name = new Container<String>();
		name.setT("ȫ�浿");
		System.out.println("<T>Ÿ���Ķ���Ϳ� <String>���� ��ü ���� �� ���尪 : "+name.getT());
		
		Container<Integer> num = new Container<Integer>();
		num.setT(150);
		System.out.println("<T>Ÿ���Ķ���Ϳ� <Integer>���� ��ü ���� �� ���尪 : "+num.getT());

	}

}
