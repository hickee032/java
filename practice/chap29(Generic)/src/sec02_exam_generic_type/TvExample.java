package sec02_exam_generic_type;

public class TvExample {

	public static void main(String[] args) {
		Tv<String> tv1 = new Tv<String>();
		tv1.setT("LG OLED TV");
		String str = tv1.getT();
		System.out.println("���� TV�� "+str+"�Դϴ�.");
		
		Tv<Integer> tv2 = new Tv<Integer>();
		tv2.setT(46);
		System.out.println("���� TV�� "+str+"�̸� ũ��� "+tv2.getT()+"��ġ �Դϴ�.");
		
		/* ���׸� �ڵ�� Ÿ�� ��ȭ�� ���� �ϸ鼭 ���α׷� ������ ��� ��Ű�� �پ��� Ÿ���� �����Ͽ� �����Ҽ� �ִ� ������ �ִ�. 
		 * �÷��ǿ����� �������� ����ȭ�� �����ͼ� �ŷڵ��� �����ش�. 
		 * ���� ��Ÿ�ӿ����� �߻��ϴ� �ͺ��� ������ ������ �߻��ϴ� ���� �ξ� ���α׷��ӿ��� ������ �ȴ�.
		 */

	}

}
