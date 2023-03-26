package Assignment08_Student;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public int getTotal() {
		int result = kor + eng + math;
		return result;
	}

	public float getAverage() {
		float result = (float) ((kor + eng + math) / 3);
		return result;
	}

	public Student() {
		this("√÷¿ÁøÌ", 2, 1, 80, 50, 60);
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		String str = "¿Ã∏ß : " + this.name + "\n√—¡° : " + this.getTotal() + "\n∆Ú±’ : " + this.getAverage();
		return str;
	}
}
