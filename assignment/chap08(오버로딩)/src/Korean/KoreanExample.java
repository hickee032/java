package Korean;

public class KoreanExample {

	public static void main(String[] args) {
		Korean kor = new Korean("대한민국", "김용범", 178, 26, "대구사투리");

		System.out.println("첫 번째 공개 수배자입니다");

		System.out.println(kor);

		Korean kor1 = new Korean("USA", "유재웅", 172, 29, "어설픈 영어");

		System.out.println("\n두 번째 공개 수배자입니다.");

		System.out.println(kor1);

	}

}
