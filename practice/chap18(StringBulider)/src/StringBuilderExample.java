
public class StringBuilderExample {

	public static void main(String[] args) {
		/* buffer 임시 메모리 공간, L1,L2캐쉬 램까지 확장)을 이용하기 때문에 
		 * 단일 인스턴스 모든 조작 가능 */
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.append("자바");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());

		sb.insert(0,1);
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());
		
		//StringBuilder,buffer의 replace(0,1,"객체")는 뒤에 것을 포함 하지 않는 다.
		sb.replace(0, 1, "객체");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
