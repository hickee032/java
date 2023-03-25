package sec02_exam_ParserExample;

public class ParserExample {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.Parse("문서-1.XML");
		
		parser = ParserManager.getParser("HTML");
		parser.Parse("문서-2.HTML");

	}

}
