package sec_verify01;

public class BoxingExample {

	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i;
		System.out.println("i를 자동 박싱한  intObject의 값 :  " + intObject);
		i = intObject;
		System.out.println("intObject를 i로 자동언박싱한 값 : " + i);

	}

}
