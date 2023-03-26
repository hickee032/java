package sec_verify01;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> name = new Container<String>();
		name.setT("홍길동");
		System.out.println("<T>타입파라메터에 <String>으로 객체 생성 후 저장값 : "+name.getT());
		
		Container<Integer> num = new Container<Integer>();
		num.setT(150);
		System.out.println("<T>타입파라메터에 <Integer>으로 객체 생성 후 저장값 : "+num.getT());

	}

}
