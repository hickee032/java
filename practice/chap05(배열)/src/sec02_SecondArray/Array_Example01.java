package sec02_SecondArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		int[][] score = new int [][] {
										{100,100,100},
										{ 20, 20, 20},
										{ 30, 30, 30},  //0���� �����ϴϱ� 30�� �����ϱ����ؼ��� score[2][3]
										{ 40, 40, 40}
									};
									
		// score[i][j] ������ ����
		int sum = 0;
		System.out.println("2���� �迭�ּҰ� : " + score); //[[I@15db9742 2���� �迭�� ��� �ּҰ����� [[
													 //[I@6d06d69c 1���� �迭�� ��� �ּҰ����� [
		System.out.println("score�� ����" + score.length);
		//2���� �迭�� �����ϱ� ���� �ߺ� for���� ���
		
		//�Ʒ� for���� ��� 2���� �迭�� �� �� �ܼ��� ����ϰ��ִ�. (12�� �ݺ�)
		//������ 1���� �迭�ǰ�쿡�� �̱۷��� 2���� �迭�� ��� �������
		for(int i=0; i<score.length; i++) {
			//2���� �迭������ 1���� �迭�� ���� �ּҰ� �Ǳ� ������  �Ʒ��� ����غ��Ҵ�.
			System.out.println("1���� �迭�� �ּҰ�" + score[i]);
			for(int j=0 ;j<score[i].length; j++) {
				System.out.println("score["+i+"]"+"["+j+"] =" + " " +score[i][j]);
				
			}	
		}
		//���� for�� JDK1.5�̻�
		//�Ŀ� �÷��� ������ �� �κп��� ��ü�� �����Ҷ� �Ʒ��� ����
		//���� for���� ���
		//������ Ÿ�� ���� :������ ���(�ּ�)
		for(int[] tmp :score) {
			//1���� �迭Ÿ��
			for(int i :tmp) {
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
	}

}
