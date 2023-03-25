package sec01_exam_OverraidingExample;

//조상클래스
public class HDDdisk {
	// 멤버변수
	int capacity; // 용량
	int rpm; // 속도
	
	// 기본생성자.
	public HDDdisk() {

	}
	//매개변수가 있는 생성자.
	//생성자는 멤버변수의 초기화를 할떄 가장 많이 활용. 
	public HDDdisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;

	}
	//this 자기자신의 주소

	public String status() {
		return "하드디스크이 용량" + this.capacity + "GB , RPM은 " + this.rpm + "입니다.";
	}

}
