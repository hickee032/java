package sec_verify06;

public class CloneExample {

	public static void main(String[] args) {

		Student ori = new Student("perpear", "�Ȱ�����");

		System.out.println("Student�ν��Ͻ�1 : " + ori.toString());

		Student cloned = ori.getStudent();
		
		//System.out.println("Student�ν��Ͻ�2 : " + cloned.toString());
	}

}
