package sec03_exam_Nested_Class_and_Method_Access;

public class B {
	int field1;
	void methid1() {}
	
	static int field2;
	static void method2() {}
	
	//C�� B�� �����ǰ� ���� ����� ���� �ϹǷ� B.this. ����
	class C{
		void method() {
			//�ٱ� Ŭ������ ���� ������ ���谡 ���� ��� �̷������� ���
			//�ν��Ͻ� ���
			B.this.field1 = 30;
			B.this.methid1();
			B.field2 = 20;
			B.method2();
			
		}
	}

	static class D{
		void method() {
			
			B.this.field1 = 110; //�ٱ� Ŭ������ �ν��Ͻ� ������� �������� ���Ѵ�. why? static�Ӽ��� ����� �ϰ� field1�� ���� 
				//static �ȿ��� this���!!				 
			B.this.method1();
			B.field2=20;// ���� ������� ���� ���� �ϴ� why?
			B.method2();
		}
	}
}
