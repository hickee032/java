package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {

		Fighter f = new Fighter();

		/*
		 * �������̽� �ʵ��� ������ - �������̽��� ������ �����̴�. �ٺ��� ����� ���ϹǷ� Fighter�ν��Ͻ��� �ִ� �޼��� �ٺ��� �ִ� �����
		 * ����� �����ϴ�.
		 */
		// Fightable fi = new Fighter();
		// Moveable mi = new Fighter();
		// Attackable ai = new Fighter();
		
		// Ŭ������ ����� �����ϰ� ������ �ʵ��� ������
		// Unit u = new Fighter();

		/*
		 * u. 
		 * f. �ٺ��� ���� ����Ҽ� �ִ� �޼��尡 �ٸ���.
		 */

		// �Ʒ��ڵ尡 �� ������ ���´ٴ� ���� ���� ����ȯ�� �����ϴٴ� ��
		// �ٽø��ؼ� �����̴� �� ���̴�.
		if (f instanceof Unit) {
			System.out.println("f�� Unit ���� �������� �մϴ�.");
		}

		if (f instanceof Fightable) {
			System.out.println("f�� Fightable ���� �������� �մϴ�.");
		}

		if (f instanceof Moveable) {
			System.out.println("f�� Moveable ���� �������� �մϴ�.");
		}

		if (f instanceof Attackable) {
			System.out.println("f�� Attackable ���� �������� �մϴ�.");
		}

		f.move(100, 100);
		f.attack(new Fighter());

	}

}
