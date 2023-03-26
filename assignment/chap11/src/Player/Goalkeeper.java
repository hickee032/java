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
		System.out.println("골키퍼 선수를 소개합니다.");
		super.infoPrint();
		System.out.println("세이빙 횟수 :" + this.getSave());
		System.out.println();
	}
	
}
