package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("홍길동"); //업캐스팅 형변환제거 가능 : String --> Object

		String name = (String)box.getObject(); //다운캐스팅 형변환제거 불가능 : Object --> String
		System.out.println(name);
	}

}
