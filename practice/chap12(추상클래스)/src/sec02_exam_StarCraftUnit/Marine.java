package sec02_exam_StarCraftUnit;

public class Marine extends Unit {
	
	String str;
	
	public Marine() {}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("������ ��ġ : "+this.x+","+this.y+"�� �̵�");
		
		
	}
	
	public void steamMode() {
		this.str = "���� ��� : ������ ����";
		System.out.println(this.str);
	}

}


