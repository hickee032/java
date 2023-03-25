package sec02_try_catch_finally;

public class TryCatchFinallyExample01 {

	public static void main(String[] args) {
		/*
		 * ClassŬ������ ���ڿ��� ������ Ŭ������ ���� ��ȯ 
		 * (�ν��Ͻ��� ����Ҽ� ������ ��ȯ�� �ν��Ͻ��� �������� �˻�) 
		 * ������ ���ڿ��� �ش��ϴ� Ŭ������ ���ٸ� �Ϲݿ��ܰ� �߻��Ѵ�. 
		 * �׷��� �������� ���� �ʴ´�. ����ó���� �ʼ���
		 */
		try {
			
			Class clazz1 = Class.forName("java.lang.String2");  //JSP, DB����
			//Class clazz = Class.forName("java.lang.String");
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�.");
		}
		catch (Exception e) {
			System.out.println("���� �߻���");
		}
		finally {
			System.out.println("���α׷��� �����ϰ� ����");
		}

	}

}
