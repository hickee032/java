package sec01_firstArray;

public class ArrayExample01 {

	public static void main(String[] args) {
			//int�� �迭�� score(��������)�� int[5] = 20����Ʈ ������ �ּҰ� �ѱ�
		int[] score = new int[10]; //10���� ���� 0���� �ڵ� �ʱ�ȭ //�迭���� �ּҸ� ����Ų��.
		
		int k=1;
		score[0]=50;
		score[1]=60;	// score[1] = ������ ����
		score[k+1]=70; //score[2] = 70
		score[3]=80;
		score[4]=90;
		//score : int[] �ּҰ� ����
		//score[i] �ε����� �ִ� �������� �ǹ�
		
		int tmp = score[k+2] +score[4];
		
		//for������ �迭�� ��� ��� ���
		for (int i=0; i<score.length; i++) {
			//           0~n-1����  9����
			System.out.println("score["+i+"]"+score[i]);
		}
		System.out.println("tmp :"+ tmp);
		System.out.println("score[7] :" + score[7]);
		System.out.println(score); //�ּҰ� ���
}
}