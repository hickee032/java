package sec02_exam_SuperExample;

public class Child extends Parent {

	int x = 100;

	void method() {
		
		System.out.println("현재 인스턴스의 x=" + x);
		System.out.println("자손 클래스 this.x=" + this.x);
		System.out.println("조상 클래스 super.x=" + super.x);
	}

	@Override
	public String toString() {
		return "메롱";
	}
}
