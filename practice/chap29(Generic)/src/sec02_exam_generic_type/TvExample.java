package sec02_exam_generic_type;

public class TvExample {

	public static void main(String[] args) {
		Tv<String> tv1 = new Tv<String>();
		tv1.setT("LG OLED TV");
		String str = tv1.getT();
		System.out.println("나의 TV는 "+str+"입니다.");
		
		Tv<Integer> tv2 = new Tv<Integer>();
		tv2.setT(46);
		System.out.println("나의 TV는 "+str+"이며 크기는 "+tv2.getT()+"인치 입니다.");
		
		/* 제네릭 코드는 타입 변화을 제거 하면서 프로그램 성능을 향상 시키고 다양한 타입을 지정하여 개발할수 있는 장점이 있다. 
		 * 컬렉션에서는 데이터의 통일화을 가져와서 신뢰도를 높여준다. 
		 * 또한 런타임에러가 발생하는 것보다 컴파일 에러가 발생하는 것이 훨씬 프로그래머에게 도움이 된다.
		 */

	}

}
