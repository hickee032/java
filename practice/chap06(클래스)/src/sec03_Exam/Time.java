package sec03_Exam;

public class Time {

	/*
	 * 접근 제어자(Access Modifier) 의 종류 1. private : 같은 클래스내에서만 접근가능 2. protected : 같은
	 * 패키지, 다른 패키지 자손 클래스에서만 접근가능 3. default : 같은 패키지, 다른 패키지 접근가능 4. public : 어떤
	 * 클래스나 다 접근 가능
	 */

	private int hour;
	private int minute;
	private int secnond;

//--------------------------------------------	
	// private로 변수를 가져갔을때 반드시 getter 메서드가 필요하다.
	// getter 메서드 : 멤버변수의 값을 가져가게하는 것
	public int getHour() {
		//
		return this.hour;
	}

	public void sethour(int hour) {
		//예외 처리
		if (hour < 0 || hour > 23) {
			System.out.println("시간 잘못 입력");
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("분 잘못 입력");
			return;
		}
		this.minute = minute;
	}

	public int getSecnond() {
		return this.secnond;
	}

	public void setSecnond(int secnond) {
		if (secnond < 0 || secnond > 59) {
			System.out.println("초 잘못 입력");
			return;
		}
		this.secnond = secnond;
	}

// --------------------------------------------
	// object클래스의 toString메서드 재정의 (오버라이딩)함
	// this는 현재 자신의 클래스를 의미함.
	@Override
	public String toString() {
		String str = this.getHour() + ":" + this.getMinute() + ":" + this.getSecnond() + "초";
		return str;

	}

}
