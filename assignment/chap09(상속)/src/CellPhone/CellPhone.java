package CellPhone;

public class CellPhone {

	String model;
	String color;

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끔니다.");

	}

	public void bell() {
		System.out.println("벨이 울려요");

	}

	public void sendVoice() {
		System.out.println("나: 여보세요");
		this.receiveVoice();
		System.out.println("나: 꺼져요");

	}

	public void receiveVoice() {
		System.out.print("상대방 : ");
		System.out.println("좋은말씀 전하려고 합니다.");
	}

	public void hangUp() {
		System.out.println("전화 종료");
	}
}
