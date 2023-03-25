package sec01_equals;

public class Member {
	String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}

	// 매개변수 object가 있다 이의미는 무엇일까?
	@Override
	public boolean equals(Object obj) {

		System.out.println("equals() 호출");

		// 타입변환이 가능 한지 알아보기 위해 instanceof 사용
		if (obj instanceof Member) {
			Member member = (Member) obj; // 다운캐스팅은 반드시 형변환 코드가 필요하다.
			// 논리적 동등을 위해 조건문 설정.
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
