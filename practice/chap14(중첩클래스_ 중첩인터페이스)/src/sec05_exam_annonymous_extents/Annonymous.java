package sec05_exam_annonymous_extents;

public class Annonymous {

	// 멤버변수의 초기값
	// 조상 클래스인 Person을 상속 받는 익명 자손 (자식) 객체를 만드는 형태
	// 익명 자손객체를 만드는 이유 - ui프로그램이나 이벤트 처리시에 잠깐 사용하는 용도로 만들어진다.
	// 익명 자식 객체가 클래스라서 멤버들을 선언할수 있으나 통상 이런 멤버들은 조상의 메서드를 오버라이딩 할때
	// 필요한 값으로 사용하기위해 선언
	Person field = new Person() {
		// 익명자식 객체의 멤버들로써 외부에서 절대 접근 안된다.
		// why?이름이 없을 뿐더러 인스턴스의 주소가 저장되어 있는 참조변수의 근본은 ?"
		int childfield = 2;

		public void work() {
			System.out.println(this.childfield + "시에는 일을 합니다.");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어난다.");
			this.work();
		}
	};

	public void method() {
		// 로컬변수의 초기값으로 익명 자손 객체를 만듬
		// 외부에서 접근 못함.(메서드 안에서만 사용)
		Person localvar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				this.walk();
			}
		};
		localvar.wake();
	}

	// 매개변수의 매개값으로 익명 자손 객체를 넘겨주는 형태
	public void method2(Person person) {
		if (person instanceof Person) {
			Person p = person;
			p.wake();
		}
	}
}
