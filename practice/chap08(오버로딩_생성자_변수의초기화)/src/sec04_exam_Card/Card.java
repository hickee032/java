package sec04_exam_Card;

public class Card {
	// ������ ���ƾ� �� ���� ��, ����������
	static final int KIND_MAX = 4; // ī�� ������ ��
	static final int NUM_MAX = 13; // ���̺� ī�� ��

	// ���̸� ����� ����
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	// �������
	int kind;
	int number;

	// ������
	public Card() {
		this(SPADE, 1); // �ٸ� ������ ȣ��
	}

	// ������
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// ObjectŬ������ toString()������
	@Override
	public String toString() {

		System.out.println("toString ȣ��");

		String kind = "";
		String number = "";

		// ���� ����
		switch (this.kind) {
		case 4:
			kind = "�����̵�";
			break;
		case 3:
			kind = "���̾Ƹ��";
			break;
		case 2:
			kind = "��Ʈ";
			break;
		case 1:
			kind = "Ŭ�ι�";
			break;
		}
		// ���� ����
		switch (this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
		}
		return "������ " + kind + ", ���ڴ� " + number;
	}
}