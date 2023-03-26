package Car1.copy;

public class Tire {

	int maxRotation; // Ÿ�̾� �ִ� ȸ����

	int accumulatedRotation; // Ÿ�̾� ���� ȸ����

	String location; // Ÿ�̾� ��ġ
	
	

	public Tire(String location, int maxRotation) {

		this.location = location;

		this.maxRotation = maxRotation;

	}

	public boolean roll() {

		++accumulatedRotation;

		if (this.accumulatedRotation < this.maxRotation) {

			System.out.println(this.location + "����" + (this.maxRotation - this.accumulatedRotation));

			return true;

		} else {

			System.out.println("*** " + this.location + "Tire ��ũ ***");

			return false;

		}

	}

}
