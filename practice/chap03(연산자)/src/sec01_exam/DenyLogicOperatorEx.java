package sec01_exam;

public class DenyLogicOperatorEx {

	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println(play);
		
		play = !play; //연산자는 반대값을 취한다. 논리 부정연산자 =not 연산자
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}
