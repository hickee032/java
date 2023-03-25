package sec02_exam;

public class PrimitiveParamEx {

	public static void main(String[] args) {

		Data d = new Data();
		
		d.x=10;
		
		System.out.println("main():x = "+d.x);
		//PrimitiveParamEx.change(d.x);
		change(d.x); 
		
		System.out.println("change(d.x) È£ÃâÈÄ");
		System.out.println("main():x = "+d.x);

	}
	
	public static void change(int x) {
		x=1000;
		System.out.println("change(x):=" +x);
	}
}
