package sec02_exam_StarCraftUnit;

public class DropShip extends Unit {

	String str;

	public DropShip() {
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;

		System.out.println("드랍쉽의 위치" + this.x + "," + this.y + "로 이동");

	}

	public void ULode() {
		this.str = "유닛탑승";
		System.out.println(this.str);

	}

	public void DLode() {
		this.str = "유닛하강";
		System.out.println(this.str);
	}

}
