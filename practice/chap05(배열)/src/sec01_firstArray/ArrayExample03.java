package sec01_firstArray;

import java.util.Arrays;

public class ArrayExample03 {

	public static void main(String[] args) {


		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10]; //����� 0���� �ڵ� �ʱ�ȭ 40byte
		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr4 = new int[] {100,95,80,70,60};
		
		char[] chArr = new char[] {'a','b','c','d'}; //8byte char=2byte
		
		System.out.print("�迭i�� �ʱ�ȭ �� : ");
		
		for(int i =0; i<iArr1.length;i++) {
			System.out.print(iArr1[i]);
		}
				System.out.println();
				
				for (int i=0;i<iArr1.length;i++) {
					iArr1[i] = i + 1; //1~10�� ���ڸ� ������� �迭�� �ִ� ��.
					}
				
				for (int i=0;i<iArr2.length;i++) {
					iArr2[i] = (int)(Math.random()*10) +1; //1~10�� ���� �迭�� ����
					}
				
				//�迭�� ����� �� ���
				for (int i=0;i<iArr1.length;i++) {
					if(i==9) {
						System.out.print(iArr1[i]);
					}
					else {
						System.out.print(iArr1[i]+",");
					}
					
				}
					System.out.println();
					//int[] ���� toString ȣ�� �� ��� String ���·� ��ȯ
					System.out.println(Arrays.toString(iArr2));//[�迭��, �迭��,...���� ���
										//���� �ż��� ȣ��  class + . to iArr 
					System.out.println(Arrays.toString(iArr3));
					System.out.println(Arrays.toString(iArr4));
					
					System.out.println(Arrays.toString(chArr));
					
					System.out.println(iArr3.toString());
					System.out.println(iArr3);
					System.out.println(chArr.toString());
					//charŸ���� toString ȣ�� �ؾ� �ּҰ�
					System.out.println(chArr.toString());
					System.out.println(chArr); //���� ��� (char�迭��)
				}
	}
	


