package sec06_exam_annonymous_implements;

public class AnnonymousExample {

	public static void main(String[] args) {

		Annonymous anony = new Annonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(anony.field);
		
//		anony.method2(new RemoteControl() {
//			
//			@Override
//			public void turnOn() {
//				System.out.println("컴퓨터를 켜다");
//			}
//			
//			@Override
//			public void turnOff() {
//				System.out.println("컴퓨터를 끄다");
//				
//			}
//		});

	}

}
