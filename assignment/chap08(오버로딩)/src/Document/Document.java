package Document;

public class Document {

	static int count = 0;
	String name = "제목없음";

	public Document() {
		count++;

		// System.out.println("문서 "+ name +count+" 가 생성되었습니다.");
	}

	public Document(String name) {
		this.name = name;
		// System.out.println("문서 "+name+" 가 생성되었습니다.");
	}

	@Override
	public String toString() {
		String str = "문서 " + name + count + " 가 생성되었습니다.";
		return str;
	}
}
