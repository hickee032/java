package sec06_exam_initializeblock;

public class Product {

	static int count = 0; //생성된 인스턴스 수 저장
	int serialNO; //인스턴스 고유 번호

	{
		++count;
		serialNO = count;
	}

	//기본생성자 생략 가능
	public Product() {

	}
}
