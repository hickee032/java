package sec02_SecondArray;

public class Array_Example02 {

	public static void main(String[] args) {
		
		int [][] score = new int [][] {
			{100, 100, 100},
		//	   00   01   02      //score[0][1]��  ������ score[0][i]���� ���� �� ������ ����
			{ 20,  20,  20},     //����ڿ��� �Է� �޴� ��쿡��  ���� ���� ���� ������ �Է� �޴� ��.
			{ 30,  30,  30},
			{ 40,  40,  40},
			{ 50,  50,  50}
		};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		int totalsum = 0;
		float averagesum = 0.0f;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���"); //\t tab
		System.out.println("===================================================");
		
		for (int i =0 ;i<score.length; i++) {
			
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0]; 		 //�������� //�� �迭�� ù��°����  total�� ���� ������ score[0][0]+score[1][0]....
									         // ���� �� ������ ��Ÿ����.
			engTotal += score[i][1];  		 //���� ����
			mathTotal += score[i][2]; 		 //���� ����
			
			//3���� �ڸ��� �����ϸ� ���
			System.out.printf("%3d", i+1); 	//%d�� ���� ���� ���°� %3d�� 2ĭ ��� ���� 3��° �ڸ��� ����.
			
			for (int j =0 ; j < score[i].length ;j++) {
				
				sum +=score[i][j];     					//���� for������ �� ��ȣ�� ������ sum�� �����Ѵ�.
				          //0  3
				          //1  3
				System.out.printf("\t%d", score[i][j]); //score[i].length�� ���� ������ ���� �迭�� ��ġ�� ���ؼ�
														//score[0][i]�� ������ �հ踦 ��Ÿ���� ���ؼ�
			}
			totalsum += sum; //5��° ���� ������ ������ ��Ÿ���� ��
			avg = sum/(float)score[i].length; //float
			
			averagesum += avg;
			System.out.printf("\t%d \t%.2f%n", sum, avg);
			}
			averagesum /= (float)score.length;
			
			System.out.println("==========================================================");
			System.out.printf("����\t%d\t%d\t%d\t%d\t%.2f",korTotal, engTotal, mathTotal, totalsum, averagesum);	
				
			}
			
		}

	
	

