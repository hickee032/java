package sec01_exam;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {

int time = (int)(Math.random()*4) +8;
System.out.println("[����ð�: "+ time +"   ��]");

switch(time) {
case 8:
	System.out.println("���");
	break;
case 9:
	System.out.println("ȸ��");
	break;
case 10:
	System.out.println("����");
	break;
default:
	System.out.println("�ܱ�");
	break;
}
	}

}
