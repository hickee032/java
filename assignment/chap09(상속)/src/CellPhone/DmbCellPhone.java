package CellPhone;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super();
		//this.model = model;
		super.model = model;
		super.color = color;
		this.channel = channel; 

		System.out.println("�� : " + super.model);
		System.out.println("���� : " + super.color);
		System.out.println("ä�� : " + this.channel);
	}

	public void turnonDmb() {
		System.out.println(this.channel + "������ ��� ���� ����");
	}

	public void changeChannelDmb(int channel) {
			this.channel=channel;
			System.out.println("ä��"+this.channel+" ������ �ٲߴϴ�.");
	}

	public void turnOffDmb() {
			System.out.println("��� ���� ����");
	}


}

