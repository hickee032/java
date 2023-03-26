package Unit;

public class AirForce extends Unit {

	public AirForce(String name) {

		super(name);

		// System.out.println(super.getName()+" >> "+"전투 준비");

	}

	@Override

	public void attack() {

		System.out.println(super.getName() + " >> " + "이륙");

		System.out.println(super.getName() + " >> " + "공중 공격");

		this.bombing();

	}

	public void bombing() {

		System.out.println(super.getName() + " >> " + "폭격");

	}

}
