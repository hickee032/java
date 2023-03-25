package sec01_firstArray;

public class ArrayExample06 {

	public static void main(String[] args) {
		
		char[] abc = new char[] {'A','B','C','D'};
		char[] num = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc); //char[]는 안의 값을 출력
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length +num.length];
		
		//java.lang.System클래스 API참조
		//abc:원본 배열,0 :abc배열의0번째 인덱스
		//result:타겟배열
		//0:타겟배열의 인덱스, abc.length :4만큼 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num.toString());
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}

}
