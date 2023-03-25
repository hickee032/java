package sec02_exam_ParserExample;

public class ParserManager {
	//메인이 스태틱이므로 스태틱
	
	
	public static Parseable getParser(String type) {
		
		//String equals은 값 비교 
		//객체의 비교는 기본적으로 주소 비교
		
		if (type.equals("XML")) {
			//인스턴스 생성후 주소 리턴
			return new XMLParser();
		}
		else {
			//인터페이스 필드의 다형성
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
		
	}
}
