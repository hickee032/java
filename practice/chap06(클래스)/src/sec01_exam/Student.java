package sec01_exam;

//�Ӽ� 2���� ����� �ϳ��� ���� Ŭ������ �������
//�ϳ��� �ڹ� ���Ͽ��� ���������� public ������ �Ѱ����߸� �Ѵ�
//����������

/*
1. private : ���� Ŭ������������ ���ٰ���
2. protected : ���� ��Ű��, �ٸ� ��Ű�� �ڼ� Ŭ���������� ���ٰ���
3. default : ���� ��Ű��, �ٸ� ��Ű�� ���ٰ���
4. public : � Ŭ������ �� ���� ����
*/

public class Student {
	
	int age = 28;
	String name = "��â��";
	
	@Override
	public String toString() {
	 return "�̸� : " + this.name + ", ���� : " + this.age;
	}
}
