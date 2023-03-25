package sec_exam_RepairableExample;

public class Dropship extends AirUnit implements Repairable {

	//static int hitpoint;

	public Dropship() {
		super(125);
		System.out.println(this.toString() + "�� Hp��" + this.MAX_HP + "�Դϴ�.");
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {

		return "Dropship";
	}

	@Override
	public void DamageUnit(Repairable r, int Damage) {
		if (r instanceof Unit) {
			Unit unit = (Unit) r;
			System.out.println(unit + "��" + Damage + "��ŭ ������");
			System.out.println(unit + "���� hp " + (this.MAX_HP - Damage));
			System.out.println(unit + "�����ʿ�");
		}
		this.hitpoint -= Damage;
	}

}
