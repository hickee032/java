package sec04_exam;

public class MemberCall {

	public static void main(String[] args) {
		 Member mb = new Member();
		 
		 System.out.println(mb.iv);
		 System.out.println(Member.cv);
		 
		 mb.instanceMethod();
		 Member.staticMethod();
		 
		 System.out.println(mb.iv);
		 System.out.println(mb.cv); //>>> System.out.println(Member.cv);
		 
		 mb.instanceMethod();
		 mb.staticMethod(); //>>> Member.staticMethod();
		 

	}

}
