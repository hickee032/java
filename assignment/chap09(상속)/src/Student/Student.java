package Student;

public class Student extends Person {
	
	private String S_num;
	
	public Student(String P_name, String S_num) {
		super();
		
		this.setP_name(P_name);
		this.S_num = S_num;
	
	}
	
	@Override
	public String toString() {
		String str = "�й� : "+S_num;
		System.out.println("�й���"+S_num);
		return str;
		

}
}
