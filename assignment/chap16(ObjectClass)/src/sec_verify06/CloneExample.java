package sec_verify06;

public class CloneExample {

	public static void main(String[] args) {

		Student ori = new Student("perpear", "안경잡이");

		System.out.println("Student인스턴스1 : " + ori.toString());

		Student cloned = ori.getStudent();
		
		//System.out.println("Student인스턴스2 : " + cloned.toString());
	}

}
