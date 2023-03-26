package Player;

public class Goalkeeper extends Player {

	int save;

	public Goalkeeper(String name, int age, int backNumber, int spd, int save) {
		super(name, age, backNumber, spd);
		this.save = save;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	@Override
	public void infoPrint() {
		System.out.println("��Ű�� ������ �Ұ��մϴ�.");
		super.infoPrint();
		System.out.println("���̺� Ƚ�� :" + this.getSave());
		System.out.println();
	}
	
}
