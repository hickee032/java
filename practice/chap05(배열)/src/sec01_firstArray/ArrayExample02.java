package sec01_firstArray;

public class ArrayExample02 {

	public static void main(String[] args) {

	int sum = 0; //������ �����ϱ� ���� ����
	//float average = 0.0f; //(float)�� �ٿ��ش�
	Double average = 0.0;
	
	//����� ���ÿ� �ʱ�ȭ
				//new int[] �����Ϸ��� �˾Ƽ� {}���� ����  �̰��� 5
	int[] score = new int[] {100, 88, 100, 100, 90};
	
	System.out.println("�迭�� ����" + score.length);
	
	for(int i=0;i<score.length;i++) {
		System.out.println("�������� ��"+score[i]); //����� �غ��� ����� ��� ���� �˼��ִ�.
		sum +=score[i]; //+= ���մ��Կ�����
		}
		average =  sum /(double)score.length;
		//average =  sum /(float)score.length;
		//float + int = float
		//char + int = int
		//�ִ�Ÿ�� +"���ڿ�" = ���ڿ�
		System.out.println("����"+sum);
		System.out.println("���"+average);
	}
	}


