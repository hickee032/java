package sec_verify01;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	@Override
	public int hashCode() {
		//int result = Integer.parseInt(studentNum);
		//return result;
		//String Ŭ�������� �̹� ������ ���ڿ��̶�� hashcode�� �Ȱ��� ������� �������ش�.
		//�����ǰ� �Ǿ��ִ�.
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (this.studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}

}
