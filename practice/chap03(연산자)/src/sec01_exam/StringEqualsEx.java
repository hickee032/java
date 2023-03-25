package sec01_exam;

public class StringEqualsEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//Object의 참조변수에서 ==연산과 equals()는 같은 역할(주소값 비교)을 한다.
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();

		String strVar1 = "신민철";
		String strVar2 = "신민철";
		//새로운 객체 생성 (주소가 달라짐)
		String strVar3 = new String("신민철");
		
		//주소값 비교 (자바에서는 String의 리터럴 값이 같을 경우 같은 번지 참조함)
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3); //주소값 비교
		System.out.println();
		
		//값을 가지고 비교 (equals는 비교대상과 값이 같은지 비교)
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); //값을 가지고 비교

	}

}
