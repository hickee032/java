package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This");
		System.out.println("기존 스트링버퍼 sb 출력 : " + sb);
		System.out.println(sb.hashCode());

		sb.append(" is pencil");
		System.out.println("변형된 스트링버퍼 sb 출력 : " + sb);
		
		sb.insert(8, "my ");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);

	}

}
