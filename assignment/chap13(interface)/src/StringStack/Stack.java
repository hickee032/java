package StringStack;

//인터페이스
public interface Stack {

	//추상 메서드 - 길이를 리턴할 용도
	int length();

	//추상 메서드 - 리턴값 object - 배열에서 String값을 읽어 옴
	Object pop();

	//추상 메서드 - 매개변수 object - 배열에다가 String값을 저장
	void push(Object o);
}
