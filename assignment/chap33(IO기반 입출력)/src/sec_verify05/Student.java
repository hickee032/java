package sec_verify05;


public class Student {

	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;
	String name = "";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;

	// √ ±‚»≠
	public Student(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	// √—«’
	public int getTotal() {
		int sum = 0;
		sum = this.koreanScore + this.mathScore + this.englishScore;

		return sum;
	}

//	static String format(String str, int length, int alignment) {
//		//String a = String.format();
//
//		return a;
//	}

	@Override
	public String toString() {
		String a = this.name + "\t" + this.studentNo + "\t" + this.koreanScore + "\t" + this.mathScore + "\t"
				+ this.englishScore + "\t" + this.getTotal();
		
		return a;
	}

}
