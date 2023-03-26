package sec_verify06;

public class Student implements Cloneable {

	private String nID;
	private String szName;

	public Student(String nID, String szName) {
		this.nID = nID;
		this.szName = szName;
	}

	public Student getStudent() {
		System.out.println("Student�ν��Ͻ�2�� Student�ν��Ͻ�1���� ���� ������ ��");
		Student cloned = null;
	
		System.out.println("Student�ν��Ͻ�2 : "+cloned);
		try {
			cloned = (Student) this.clone();
			
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public String toString() {

		return "ID�� " + this.nID + " , NAME��" + this.szName;
	}
}
