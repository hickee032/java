package Unit;

public class UnitExample {

	public static void main(String[] args) {
		
		Unit[] units = new Unit[5];

		units[0] = new AirForce("��1���������");

		if (units[0] instanceof Unit) {

			units[0].setName("��1���������");

			units[0].attack();

		}

		System.out.println();

		units[1] = new AirForce("��38������������ ");

		if (units[1] instanceof Unit) {

			units[1].setName("��38������������ ");

			units[1].attack();

		}

		System.out.println();

		units[2] = new Navy("���� ��������");

		if (units[2] instanceof Unit) {

			units[2].setName("���� ��������");

			units[2].attack();

		}

		System.out.println();

		units[3] = new Army("��ȣ�δ� ");

		if (units[3] instanceof Unit) {

			units[3].setName("��ȣ�δ� ");

			units[3].attack();

		}

		System.out.println();

		units[4] = new Army("������ǳ�δ�");

		if (units[4] instanceof Unit) {

			units[4].setName("������ǳ�δ� ");

			units[4].attack();

		}

	}
}
