package Student;

public class Person {

	private String P_name;
	
	
	public Person() {
		
		
	}

	
	
	public String getP_name() {
		return P_name;
	}



	public void setP_name(String p_name) {
		P_name = p_name;
	}



	@Override
	public String toString() {
		String stn = "�̸��� �Է��ϼ��� : "+P_name;
		System.out.println("�̸���"+P_name);
		return stn;
	}
}
