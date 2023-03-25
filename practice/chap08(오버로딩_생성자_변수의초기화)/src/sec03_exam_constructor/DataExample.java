package sec03_exam_constructor;


//하나의 .java파일에는 public이란 접근제어자는 오로지 한개만 존재한다.
public class DataExample {

	public static void main(String[] args) {

		Data1 d1 = new Data1();
		//Data1클래스에는 어떠한 생성자도 존재하지 않는 다. 하지만 컴파일러에 의해서 아래와 같이 인스턴스를 생성할때 기본 생성자를 추가해주어서 
		//비로소 인스턴스가 만들어지 는 데 문제가 없다.
		
		Data2 d2 = new Data2();
		//Data2에는 매개변수가 있는 생성자가  존재 하므로 컴파일러가 기본생성자를 자동으로 만들어 주지 않는다
		//그리하여 코드에서 예외가 발생하고 있다.
		//예외를 없애고자 하는 방법은 
		//1생성자 호출시 인트값을 넣어주면 된다. //Data2 d2 = new Data2(10);
									//System.out.println(d2.value);
		
		//2data2클래스에 기본생성자를 추가해준다.
		
		//Data2 d2 = new Data2();
		Data2 d3 = new Data2(10);
	}

}
