package Player;

public class Player {
	private String name; // 이름
	private int age;// 나이
	private int backNumber;// 등번호
	protected int spd;// 스피드

	public Player(String name, int age, int backNumber, int spd) {
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.spd = spd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public int getSpd() {
		return spd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void infoPrint() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("등번호 : " + this.getBackNumber());
		System.out.println("스피드  : " + this.getSpd());

	}

}
