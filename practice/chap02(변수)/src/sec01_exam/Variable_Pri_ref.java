package sec01_exam;

public class Variable_Pri_ref {

	public static void main(String[] args) {
		//기본형 변수
		int a;
		a = 10;
		
		Object obj = new Object();
		System.out.println(obj.toString());//obj의 주소 출력
		//toString은 적지 않아도 괜찮다. Object는 모든 클래스의 최상클래스  (obj.toString)는 오브젝트 클래스(obj)의 주소를 나타낸다.
		
		//참조형 변수
		//주소값만 가질수 있다. 하여 null로 초기화가 가능하다.
		String str = null; //str의 주소 선언? null 없음으로
		str = new String("자바"); //string의 주소 지정 (str)
		//str에 '자바'라는 주소를 지정한다 결과창에 주소가 아닌 자바가 뜨는 이유는 오버라이딩(덮어쓰기) 때문에
		//같은 toString()이 존재할경우 최근에 것이 전에 것을 덮어쓰고 같은 속성(?)을 지니게 된다.
		
		//자바로 출력되는걸 확인할수 있다.
		System.out.println(str);
		System.out.println("a의 값 : " + a);
		System.out.println("웰컴 자바!");
		
		String str2 = null;
		System.out.println(str2);
		//str2의 주소가 null이므로 null이 출력된다.
	}
}
