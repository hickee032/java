package MammalFish;

public class Whale extends Fish implements Mammal {

	@Override //����
	public void bear(Object obj,String str) {
		if(obj instanceof Mammal) {
			System.out.println(str+" �� ������ �����ϴ�.");
		}
		else {
			System.out.println(obj+" �� ������ ���� �ʽ��ϴ�.");
		}
		
	//System.out.println("���� ������ �����ϴ�.");
		
	}

	@Override //���
	void swim(Object obj,String str) {
		if(obj instanceof Whale) {
			System.out.println(obj+"���ġ�� �����Դϴ�");
		}
		else {
			System.out.println(obj+"���ġ�� ���մϴ�.");
		}
		
	}

	
	
}
