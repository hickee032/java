package sec03_exam_constructor;

public class Data2 {
	int value;
	//�⺻������
	public Data2(){
		System.out.println("�⺻ ������ ȣ��");
	}
	
	//�Ű������� �ִ� ������ �����ڰ� 1���� �����Ѵٸ� �����Ϸ��� �⺻�����ڸ� �߰����� �ʴ´�.
	public Data2(int x) {
		System.out.println("�Ű������� �ִ� ������ ȣ��");
		this.value = x; //this�� ��ü �ڱ��ڽ��� �ּҸ� ���ϰ� �ִ�.
		
	}
}
