package sec02_exam_StarCraftUnit;

//�߻� Ŭ���� �߻� �޼��� (move())�� ���� �ϰ� �ִ�. 1���̻��� �߻� �޼��带 �����ϰ����� ��� = �߻� Ŭ����
//�ν��Ͻ��� �����Ҽ� ����.
public abstract class Unit {
	
	int x;
	int y;
	String str;
	
	//�߻� �޼��� �����ΰ� ����.
	public abstract void move(int x, int y);
	
	public void stop(String str, int x, int y) {
		this.x = x;
		this.y = y;
		this.str = str;
		System.out.println("������ġ : " + this.x+","+this.y+" �� "+this.str+" ����");
		
	}

}
