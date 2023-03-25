package sec01_firstArray;

public class ArrayExample06 {

	public static void main(String[] args) {
		
		char[] abc = new char[] {'A','B','C','D'};
		char[] num = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc); //char[]�� ���� ���� ���
		System.out.println(num);
		
		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length +num.length];
		
		//java.lang.SystemŬ���� API����
		//abc:���� �迭,0 :abc�迭��0��° �ε���
		//result:Ÿ�ٹ迭
		//0:Ÿ�ٹ迭�� �ε���, abc.length :4��ŭ ����
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num.toString());
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}

}
