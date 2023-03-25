package sec02_exam_final;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456 - 1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.nation = "usa";  //메서드 영역에서 korea로 선언
		p1.ssn = "654321 - 7654321"; //person에서 선언
		p1.name = "을지문덕";

	}

}
