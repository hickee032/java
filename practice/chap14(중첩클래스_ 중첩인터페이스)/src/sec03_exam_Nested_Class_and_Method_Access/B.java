package sec03_exam_Nested_Class_and_Method_Access;

public class B {
	int field1;
	void methid1() {}
	
	static int field2;
	static void method2() {}
	
	//C는 B가 생성되고 난후 사용이 가능 하므로 B.this. 가능
	class C{
		void method() {
			//바깥 클래스와 아주 밀접한 관계가 있을 경우 이런식으로 사용
			//인스턴스 멤버
			B.this.field1 = 30;
			B.this.methid1();
			B.field2 = 20;
			B.method2();
			
		}
	}

	static class D{
		void method() {
			
			B.this.field1 = 110; //바깥 클래스의 인스턴스 멤버에게 접근하지 못한다. why? static속성을 지녀야 하고 field1의 경우는 
				//static 안에서 this라니!!				 
			B.this.method1();
			B.field2=20;// 정적 멤버들은 접근 가능 하다 why?
			B.method2();
		}
	}
}
