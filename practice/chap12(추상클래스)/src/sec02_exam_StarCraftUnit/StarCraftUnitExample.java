package sec02_exam_StarCraftUnit;

public class StarCraftUnitExample {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		Tank t = new Tank();
		t.move(100, 200);		
		t.sizeMode();
		t.stop("탱크", 200, 300);
		
		System.out.println("--------------------------------");
		Marine m = new Marine();
		m.move(100, 200);
		m.steamMode();
		m.stop("마린", 200, 300);
		
		System.out.println("--------------------------------");
		DropShip d = new DropShip();
		d.move(100, 200);
		d.ULode();
		d.DLode();
		d.stop("드랍쉽", 200, 300);


	}

}
