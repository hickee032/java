package sec02_Exam;

public class Tv_Example03 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];//���� 3��  tv�迭 ����
		// tv ��ü �迭 = 2���� �迭�� ���´�.
		// attach �۾��� �ʿ��ϴ�.(�ʼ���)
		// �游 �Ҵ��ϴ� �� (�޸𸮿� �Ҵ�) �ּ� �Ҵ�
		int i =0;
		
		for (i=0; i <tvArr.length ; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i] �� i+10����
			System.out.println(tvArr[i].channel);
		}
		for (i=0; i <tvArr.length ; i++) {
			tvArr[i].channelUp(); //tvArr[i] �ż��� ȣ��  ä���� 1����
			System.out.printf("tvArr[%d].channel=%2d %n",i,tvArr[i].channel);
		}
		System.out.println();
		//���� for
		//������ Ÿ�� : ������ ���
		for(Tv tv:tvArr) {
			tv=new Tv();
			tv.channel=10; //tvArr ���ο� �ν��Ͻ� ���� channel�� 10 ����
			System.out.println(tv.channel);
		}
	}

}
