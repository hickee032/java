package Player;

public class Player {
	private String name; // �̸�
	private int age;// ����
	private int backNumber;// ���ȣ
	protected int spd;// ���ǵ�

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
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getAge());
		System.out.println("���ȣ : " + this.getBackNumber());
		System.out.println("���ǵ�  : " + this.getSpd());

	}

}
