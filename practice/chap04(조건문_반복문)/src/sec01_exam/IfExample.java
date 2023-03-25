package sec01_exam;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		//몇십개의 if문이 존재하더라도 CPU는 모든 if문을 참조한다.
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
			
			//{}은 한줄일때 생략할수 있지만 왠만하면 {}로 묶어주는 데 보기좋다.
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다");
		
		}

	}

}
