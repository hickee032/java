package sec01_exam;

public class FieldInitValueExample {

	public static void main(String[] args) {

		//아래 코드는 FieldInitValue인스턴스를 하나 heap에 만드는 것
		//fiv는 그 인스턴스의 주소를 알고있다 하여 위 FieldInitValue클래스의
		//멤버들에게 접근 가능하다
			FieldInitValue fiv = new FieldInitValue();
			
			System.out.println("기본형 변수");
			System.out.println("byteField: " + fiv.byteField);
			System.out.println("shortField: " + fiv.shortField);
			System.out.println("intField: " + fiv.intField);
			System.out.println("longField: " + fiv.longField);
			System.out.println("booleanField: " + fiv.booleanField);
			
			//char는 값이 없다
			
			System.out.println("charFileld" + fiv.charField);
			System.out.println("floatFileld" + fiv.floatField);
			System.out.println("doubleFileld" + fiv.doubleField );
			System.out.println();
			
			
			System.out.println("참조형 변수");
			System.out.println("arrField: " + fiv.arrField);
			System.out.println("referenceField" + fiv.referanceField);
		/*
		 * 인스턴스 변수를 출력을 하면 인스턴스의 주소가 출력이 된다 object를 상속 받기 때문에 출력문에 참조변수만 넣으면 곧
		 * object클래스의 toString
		 */
			System.out.println("Class referanceValiable :" +fiv);

			FieldInitValue fiv2 = new FieldInitValue();
			
			System.out.println("기본형 변수");
			System.out.println("byteField: " + fiv2.byteField);
			
			System.out.println("참조형 변수");
			System.out.println("arrField: " + fiv2.arrField);
			
			System.out.println(fiv);
			
			
	}

}
