package sec_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable {

	//static int hitpoint;
	
	public SCV() {
	super(60);
	System.out.println(this.toString() + "�� Hp��"+this.MAX_HP+"�Դϴ�.");
	this.hitpoint = this.MAX_HP;
	}
	
	public void repair(Repairable r) {
		
		if ( r instanceof Unit) {
			int count  = 0;  ;
			Unit unit = (Unit)r;
			System.out.println("����ü��"+unit.hitpoint);
			while(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
				count++;
			}
			System.out.println(unit+"�� hp��"+count+"��ŭ ����");
		}
	}

@Override
public void DamageUnit(Repairable r, int Damage) {
	if (r instanceof Unit) {
		Unit unit = (Unit)r;
		System.out.println(unit+"��"+Damage+"��ŭ ������ �Ծ����ϴ�.");
		System.out.println(unit+"���� hp "+ (unit.MAX_HP - Damage)+"�Դϴ�." );
		System.out.println(unit+"������ �ʿ��մϴ�.");
	}
}



	
	
}
