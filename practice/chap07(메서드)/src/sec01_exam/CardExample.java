package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		
		//static�� �ν��Ͻ� ���� ���� ���� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		
		Card c1 = new Card();
		
		c1.kind = "��Ʈ";
		c1.number = 7;
		
		//c1.height = 350;
		
		//Card.height = 350;

		System.out.println("c1�� " + c1.kind + ", " +c1.number +
					"�̸�, ũ��� ("+ Card.width+","+ Card.height+")");
		
		//��������.����(static)���� - ������ ���������� �ݵ�� Ŭ������ �������������� ����
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " +c1.number +
				"�̸�, ũ��� ("+ Card.width+","+ Card.height+")");
	}

}
