package sce01.exam02_arugment;

@FunctionalInterface
//@FunctionalInterface 어노테이션은 메서드가 2개이상 선언되어있는 지 컴파일 체크를 한다.
//-->필수는 아니지만 권장사항이다.
public interface MyFuntionalInterface {
	//매개변수를 가진다.
	public void method(int x);
	//public void method1(); //에러발생
}
