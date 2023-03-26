package Player;

public class MidFielder extends Player {

	int pass;

	public MidFielder(String name, int age, int backNumber, int spd, int pass) {
		super(name, age, backNumber, spd);
		this.pass = pass;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	@Override
	public void infoPrint() {
		System.out.println("미더필더 선수를 소개합니다.");
		super.infoPrint();
		System.out.println("패스 횟수 :" + this.getPass());
		System.out.println();
	}

}
