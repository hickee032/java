package sec01_exam_FighterExample;

public class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("("+x+","+y+" )�� �̵��մϴ�.");

	}

	@Override
	public void attack(Unit u) {
		System.out.println("�����մϴ�.");

	}

}
