package sec01_exam;

//���赵, �ؾ Ʋ�� ����� �۾��� �ϴ� ��
public class FieldInitValue extends Object{

	//���������� �ϰ� �ʵ��� ��
	byte byteField;  		//1
	short shortField;		//2
	int intField;    		//4
	long longField;  		//8
	
	boolean booleanField;	//1
	char charField;			//2(�����ڵ�) 1(�ƽ�Ű�ڵ�)
	
	float floatField;		//4
	double doubleField;		//8
	
	//������ ����
	int[] arrField;			//4
	String referanceField;	//4
	
	@Override //@ annotation  object�� toString �� �ƴ϶� FieldInitValueŬ������ toString�� ȣ���ض�.
	public String toString() {
	 return "STRING";
	}
}
