package Unit;

public class Army extends Unit {

	public Army(String name) {

		super(name);

	}

	@Override
	public void attack() {

		System.out.println(super.getName() + " >> " + "���� ����");

		this.tank();

	}

	public void tank() {

		System.out.println(super.getName() + " >> " + "��ũ ����");

	}

}
