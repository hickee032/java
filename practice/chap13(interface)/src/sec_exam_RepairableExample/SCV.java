package sec_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable {

	//static int hitpoint;
	
	public SCV() {
	super(60);
	System.out.println(this.toString() + "의 Hp는"+this.MAX_HP+"입니다.");
	this.hitpoint = this.MAX_HP;
	}
	
	public void repair(Repairable r) {
		
		if ( r instanceof Unit) {
			int count  = 0;  ;
			Unit unit = (Unit)r;
			System.out.println("현재체력"+unit.hitpoint);
			while(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
				count++;
			}
			System.out.println(unit+"의 hp가"+count+"만큼 수리");
		}
	}

@Override
public void DamageUnit(Repairable r, int Damage) {
	if (r instanceof Unit) {
		Unit unit = (Unit)r;
		System.out.println(unit+"가"+Damage+"만큼 데미지 입었습니다.");
		System.out.println(unit+"현재 hp "+ (unit.MAX_HP - Damage)+"입니다." );
		System.out.println(unit+"수리가 필요합니다.");
	}
}



	
	
}
