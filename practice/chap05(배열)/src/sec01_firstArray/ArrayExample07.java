package sec01_firstArray;

public class ArrayExample07 {

	public static void main(String[] args) {

		int[] ball = new int[5];
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = (int)(Math.random()*45);
		}
		System.out.println("���� ��");
		for(int i =0;i<ball.length;i++) {
			System.out.println(ball[i]);
		}
		//������ �ϱ����ؼ��� ������� + ���ǹ� �ʼ��̴�. ���� �ʵ��� ����.
		for(int i=0;i<ball.length;i++) {
			for(int j=0;j<ball.length-1;j++) {
				//�������(����)
				if(ball[j]>ball[j+1]) {//�ε�ȣ ���� �������� ��������
					int temp = ball[j];
					ball[j]  = ball[j+1];
					ball[j+1]= temp;
				}
			}
		}
		System.out.println("���� ��");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
		}
}
	

}
