package sec_verify03;

import sec_verify03.Inner.InstanceInner;
import sec_verify03.Inner.StaticInner;

public class InnerExample {

	public static void main(String[] args) {
		Inner inner = new Inner();
		Inner.InstanceInner ii = inner.new InstanceInner();

		System.out.println("����Ŭ���� InstanceInner final static��� ���� �� ��� : " + InstanceInner.CONST);
		System.out.println("����Ŭ���� InstanceInner�� ���� �� �ν��Ͻ� ��� ���� �� ��� : " + ii.iv);

		Inner.StaticInner si = new Inner.StaticInner();

		System.out.println("StaticInnerŬ������ final static��������� ��� : " + StaticInner.CONST);
		System.out.println("StaticInnerŬ������ static��������� ��� : " + StaticInner.cv);
		System.out.println("����(����)Ŭ���� StaticInner�� ���� �� static��������� ��� : " + si.iv);

		inner.myMethod();

		
	}

}
