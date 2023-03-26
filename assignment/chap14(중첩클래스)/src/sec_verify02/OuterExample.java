package sec_verify02;

public class OuterExample {

	public static void main(String[] args) {
		
		System.out.print("외부클래스를 생성하지 않고, 정적멤버클래스(Inner)의 정적 멤버 CV값 : ");
		System.out.println(Outer.Inner.cv);
		
		Outer.Inner i = new Outer.Inner();
		
		System.out.print("외부클래스를 생성하고, 정적멤버클래스(Inner)의 인스턴스 멤버 IV값 : ");
		System.out.println(i.iv);
		
		
		

	}

}
