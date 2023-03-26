package Unit;

public class Unit {

	private String name;

	public Unit(String name) {

		this.setName(name);

		System.out.println(this.getName() + " >> " + "공격준비");

	}

	public void attack() {

		System.out.println(this.getName() + " >> " + "이륙");

		System.out.println(this.getName() + " >> " + "공중 공격");

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

}
