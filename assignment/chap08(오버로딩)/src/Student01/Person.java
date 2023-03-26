package Student01;

public class Person {

	private String P_name;

	public Person(String P_name) {

		this.P_name = P_name;

	}

	public String getP_name() {

		return P_name;

	}

	public void setP_name(String p_name) {

		P_name = p_name;

	}

	@Override

	public String toString() {

		String Pname = "¿Ã∏ß: " + getP_name();

		return Pname;

	}

}
