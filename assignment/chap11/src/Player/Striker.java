package Player;

public class Striker extends Player {

	int shoot;

	public Striker(String name, int age, int backNumber, int spd, int shoot) {
		super(name, age, backNumber, spd);
		this.shoot = shoot;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	@Override
	public void infoPrint() {
		System.out.println("공격형 FW선수를 소개합니다.");
		super.infoPrint();
		System.out.println("유효 슛팅 : " + this.getShoot());
		System.out.println();
	}

}
