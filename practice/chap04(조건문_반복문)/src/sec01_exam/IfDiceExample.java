package sec01_exam;

public class IfDiceExample {

	public static void main(String[] args) {
		/*
		 * Math.random()은0.0~0.9999999사이의 임의값 반환 그래서 int 형으로 강제캐스팅후 자기가 원하는 값을 곱하고 1을
		 * 더해줌
		 */

		int num = (int)(Math.random()*6) +1;
		//System.out.println(Math.random());
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}
		else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}
		else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}
		else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
