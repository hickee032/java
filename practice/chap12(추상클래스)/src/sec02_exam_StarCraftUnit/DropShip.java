package sec02_exam_StarCraftUnit;

public class DropShip extends Unit {

	String str;

	public DropShip() {
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;

		System.out.println("������� ��ġ" + this.x + "," + this.y + "�� �̵�");

	}

	public void ULode() {
		this.str = "����ž��";
		System.out.println(this.str);

	}

	public void DLode() {
		this.str = "�����ϰ�";
		System.out.println(this.str);
	}

}
