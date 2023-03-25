package sec02_exam_final;

public class Person {
	
	
	final String nation = "Korea"; 	//상수 선언
	final String ssn; 	//상수 선언
	String name;
	//final 초기화 방법
//	1.선언과 동시에
//	2.생성자에서 단한번

	public Person(String ssn, String name) {

		this.ssn = ssn;
		this.name = name;

	}
}
