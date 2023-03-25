package sec03_exam_constructor;

public class Data2 {
	int value;
	//기본생성자
	public Data2(){
		System.out.println("기본 생성자 호출");
	}
	
	//매개변수가 있는 생성자 생성자가 1개라도 존재한다면 컴파일러는 기본생성자를 추가하지 않는다.
	public Data2(int x) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.value = x; //this는 객체 자기자신의 주소를 지니고 있다.
		
	}
}
