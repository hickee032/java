package sec_exam_RepairableExample;

public class Tank extends GroundUnit implements Repairable {

	//static int hitpoint;
	
	public Tank() {
	super(150);
	System.out.println(this.toString() + "의 Hp는"+this.MAX_HP+"입니다.");
	this.hitpoint = this.MAX_HP;
	}


@Override
public String toString() {
	
	return "Tank";
}


@Override
public void DamageUnit(Repairable r, int Damage) {
	if (r instanceof Unit) {
		Unit unit = (Unit)r;
		System.out.println(unit+"가"+Damage+"만큼 데미지");
		System.out.println(unit+"현재 hp "+ (unit.MAX_HP - Damage) );
		System.out.println(unit+"수리필요");
	}
	this.hitpoint -= Damage;
}




	
	
}
