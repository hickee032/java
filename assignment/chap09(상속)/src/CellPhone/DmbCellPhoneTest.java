package CellPhone;

public class DmbCellPhoneTest {

	public static void main(String[] args) {

		DmbCellPhone dcp = new DmbCellPhone("�ڹ���", "����", 10);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice();
		dcp.hangUp();
		dcp.turnonDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();

	}

}
