package Student01;

public class Student extends Person {

	private String S_num;

	public Student(String P_name, String S_num) {

		super(P_name);

		this.setP_name(P_name);

		this.S_num = S_num;

	}

	public String getS_num() {

		return S_num;

	}

	public void setS_num(String s_num) {

		S_num = s_num;

	}

	@Override

	public String toString() {

		String snum = "ÇÐ¹ø: " + S_num + "\n" + super.toString();

		return snum;

	}

}
