package sec02_exam_DrawShape;

//���̶�� ������ ������� �������� �ʿ��ϴ�.
public class Circle extends Shape{
	Point center = null;
	int radius;
	
	public Circle() {
		/*
		 * Circle(Point center, int radius) ȣ�� 
		 * ȣ���ϱ����� PointŬ������ �������� 
		 *  public Point(int x,int y)ȣ���ϰ� 
		 *  Circle(Point center, int radius)�� ȣ���ϸ鼭 
		 *  �������� center���� point�� �ּҸ� �Ѱ���
		 */
		this(new Point(0,0),100);
		
	}

	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	/*
	 * ����Ŭ������ ����޼����� Draw()�� �������̵�(������) �� 
	 * ���� �׸��� ��� ���� ���
	 *  (�������̵� ����ΰ� ������ ����.�����θ��ٸ��� ����)
	 */
	
	@Override
	public void	Draw() {
		System.out.println("���� :"+ this.color);
		System.out.println("���� : (x : "+this.center.x + ", y : "+this.center.y+")");
		System.out.println("������ : " + this.radius);
	}

}
