package sec_verify05;

public class StudentAnonymous {

	Student field = new Student("문수빈") {

		public void goSchool() {

			System.out.println(field.name + "이 등교합니다.");
			System.out.println("=============================");
		}

		@Override
		public void wake() {
			System.out.println("=============================");
			System.out.println("필드(멤버변수)의 초기값으로 생성된 자식객체");
			System.out.println(field.name + "이 6시에 일어납니다.");
			this.goSchool();
		}
	};

	void method1() {

		Student field = new Student("배한규") {

			public void goMoving() {
				System.out.println(this.name + "가 영화를 보러 갑니다.");
			}

			@Override
			public void wake() {
				System.out.println("로컬변수의 초기값으로 생성된 자식 객체");
				System.out.println(this.name + "가 9시에 일어납니다.");
				this.goMoving();
			}
		};
		field.wake();

	}

	void method2(Student student) {
		student = new Student("김연아") {

			public void study() {
				System.out.println(this.name + "가 공부합니다.");
				System.out.println("==============================");
			}

			@Override
			public void wake() {
				System.out.println("==============================");
				System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
				System.out.println(this.name + "가 4시에 일어납니다.");
				this.study();
			}

		};

		student.wake();

	}
}