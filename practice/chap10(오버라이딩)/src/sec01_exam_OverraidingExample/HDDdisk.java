package sec01_exam_OverraidingExample;

//����Ŭ����
public class HDDdisk {
	// �������
	int capacity; // �뷮
	int rpm; // �ӵ�
	
	// �⺻������.
	public HDDdisk() {

	}
	//�Ű������� �ִ� ������.
	//�����ڴ� ��������� �ʱ�ȭ�� �ҋ� ���� ���� Ȱ��. 
	public HDDdisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;

	}
	//this �ڱ��ڽ��� �ּ�

	public String status() {
		return "�ϵ��ũ�� �뷮" + this.capacity + "GB , RPM�� " + this.rpm + "�Դϴ�.";
	}

}
