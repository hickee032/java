package sec02_Exam;

public class Tv_Example01 {

	public static void main(String[] args) {
		
		Tv t = null; // �ν��Ͻ��� â���ϱ����� t null�ʱ�ȭ
		t = new Tv();//�ν��Ͻ� ���� ������ ȣ��
		
		t.channel=7;//�������
		t.channelDown();
		System.out.println(t.channel);
		
	}

}
