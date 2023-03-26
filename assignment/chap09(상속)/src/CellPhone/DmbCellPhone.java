package CellPhone;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super();
		//this.model = model;
		super.model = model;
		super.color = color;
		this.channel = channel; 

		System.out.println("모델 : " + super.model);
		System.out.println("색상 : " + super.color);
		System.out.println("채널 : " + this.channel);
	}

	public void turnonDmb() {
		System.out.println(this.channel + "번으로 방송 수신 시작");
	}

	public void changeChannelDmb(int channel) {
			this.channel=channel;
			System.out.println("채널"+this.channel+" 번으로 바꿉니다.");
	}

	public void turnOffDmb() {
			System.out.println("방송 수신 종료");
	}


}

