package Calculator;
//�ڼ�
public class Add extends Calc{

	@Override
	double calculate() {
		
		double result  = this.a + this.b;
		
		System.out.println(this.a +"+"+this.b+"="+result);
		
		return result;
	}
}
