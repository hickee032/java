package Unit;

public class AirForce extends Unit {

	public AirForce(String name) {

		super(name);

		// System.out.println(super.getName()+" >> "+"���� �غ�");

	}

	@Override

	public void attack() {

		System.out.println(super.getName() + " >> " + "�̷�");

		System.out.println(super.getName() + " >> " + "���� ����");

		this.bombing();

	}

	public void bombing() {

		System.out.println(super.getName() + " >> " + "����");

	}

}
