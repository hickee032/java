package Unit;

public class Unit {

	private String name;

	public Unit(String name) {

		this.setName(name);

		System.out.println(this.getName() + " >> " + "�����غ�");

	}

	public void attack() {

		System.out.println(this.getName() + " >> " + "�̷�");

		System.out.println(this.getName() + " >> " + "���� ����");

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

}
