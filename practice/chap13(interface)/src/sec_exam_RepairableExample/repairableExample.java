package sec_exam_RepairableExample;

public class repairableExample {

	public static void main(String[] args) {
		SCV scv = new SCV();
		
		//Marine marine = new Marine();
		
		Tank tank = new Tank();
		
		tank.DamageUnit(tank, 100);
		scv.repair(tank);
		
		System.out.println("----------------------------");
		
		Dropship dropship = new Dropship();
		dropship.DamageUnit(dropship, 88);
		scv.repair(dropship);
		System.out.println("----------------------------");
		
		//scv.repair(marine);//

	}

}
