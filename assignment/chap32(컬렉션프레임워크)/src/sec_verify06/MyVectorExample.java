package sec_verify06;

public class MyVectorExample {

	public static void main(String[] args) {
		MyVector v = new MyVector();
		//v.ensureCapacity(20);
		v.add("2000");
		v.add("15");
		v.add("-20");
		v.add("993");
		v.add("4000");

		System.out.println("1�� �ε��� �� : " + v.get(1));
		System.out.println("���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());
		
		System.out.println();
		v.remove("2000");
		v.remove("993");		
		System.out.println("���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());
		
		v.clear();
		System.out.println();
		System.out.println("��ü ���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());
		

	}

}
