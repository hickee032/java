package sec02_exam_ParserExample;

public class ParserManager {
	//������ ����ƽ�̹Ƿ� ����ƽ
	
	
	public static Parseable getParser(String type) {
		
		//String equals�� �� �� 
		//��ü�� �񱳴� �⺻������ �ּ� ��
		
		if (type.equals("XML")) {
			//�ν��Ͻ� ������ �ּ� ����
			return new XMLParser();
		}
		else {
			//�������̽� �ʵ��� ������
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
		
	}
}
