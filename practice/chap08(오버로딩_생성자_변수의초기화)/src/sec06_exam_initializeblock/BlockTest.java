package sec06_exam_initializeblock;

//초기화 블럭 테스트 클래스
public class BlockTest {
	
	//static초기화 블럭은 컴파일 과정에서 제일 먼저 메모리에 올라간다.
	static {
		System.out.println("정적 초기화 블럭 호출~");
	}
	//인스턴스  초기화 블럭 인스턴스 생성할때마다 호출
	{
		System.out.println("인스턴스 초기화 블럭 호출~");
	}
	
	public BlockTest() {
		System.out.println("생성자 호출~");
		
	}

	/*
	 * 초기화 순서 클래스 초기화 
	 * 기본값>명시적 초기화>클래스 초기화 블럭 
	 * 인스턴스 초기화 (현업에서는 잘 사용하지 않는 다.OCJP출제)
	 * 기본값>명시적 초기화>인스턴스 초기화>생성자
	 */
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
	}
	

}
