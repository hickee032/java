package sec05_exam_annonymous_extents;

public class AnnonymousExample {

	public static void main(String[] args) {

		Annonymous anony = new Annonymous();

		anony.field.wake();

		anony.method();

		anony.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			public void wake() {

				System.out.println("13시에 일어납니다.");
				this.study();
			}
		});
	}

}
