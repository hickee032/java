package sec02_exam_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		
		/*Box<T>���� T�� String�̴� �� BoxŬ������ ���׸� Ÿ���� Ŭ�����̸� 
		 * ������ ���� ���� String���θ� �����ؾ��Ѵ�.(�����Ϸ����� �˸��� ��)
		 * -Ÿ�� ��ȭ�� �����ϸ鼭 �ƿ﷯ ���������� �������� ����ȭ�� �Ѵ�.
		 */
		Box<String> box1 = new Box<String>();
		box1.setT("ȫ�浿");
		String name = box1.getT();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(new Integer(100));
		//box2.setT(100); //�ڵ� �ڽ�
		int num = box2.getT(); //�� �ڽ� �ڵ�
		System.out.println(num);
		
		Box<Apple> box3 = new Box<Apple>();
		box3.setT(new Apple());
		Apple a = box3.getT();
		System.out.println(a); //toString �������̵� �س���
	}

}
