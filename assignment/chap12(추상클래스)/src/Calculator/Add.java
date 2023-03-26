package Calculator;
//ÀÚ¼Õ
public class Add extends Calc{

	@Override
	double calculate() {
		
		double result  = this.a + this.b;
		
		System.out.println(this.a +"+"+this.b+"="+result);
		
		return result;
	}
}
