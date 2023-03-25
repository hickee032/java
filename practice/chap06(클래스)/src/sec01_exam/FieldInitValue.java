package sec01_exam;

//설계도, 붕어빵 틀을 만드는 작업을 하는 것
public class FieldInitValue extends Object{

	//멤버변수라고도 하고 필드라고도 함
	byte byteField;  		//1
	short shortField;		//2
	int intField;    		//4
	long longField;  		//8
	
	boolean booleanField;	//1
	char charField;			//2(유니코드) 1(아스키코드)
	
	float floatField;		//4
	double doubleField;		//8
	
	//참조형 변수
	int[] arrField;			//4
	String referanceField;	//4
	
	@Override //@ annotation  object의 toString 이 아니라 FieldInitValue클래스의 toString을 호출해라.
	public String toString() {
	 return "STRING";
	}
}
