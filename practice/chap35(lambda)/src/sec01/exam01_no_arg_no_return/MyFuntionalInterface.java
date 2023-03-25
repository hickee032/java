package sec01.exam01_no_arg_no_return;

@FunctionalInterface
//@FunctionalInterface 어노테이션은 메서드가 2개이상 선언되어있는 지 컴파일 체크를 한다.
//-->필수는 아니지만 권장사항이다.
public interface MyFuntionalInterface {
	public void method();
	//public void method1(); //에러발생
}
