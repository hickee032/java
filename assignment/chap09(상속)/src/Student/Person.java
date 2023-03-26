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
		String stn = "이름을 입력하세요 : "+P_name;
		System.out.println("이름을"+P_name);
		return stn;
	}
}
