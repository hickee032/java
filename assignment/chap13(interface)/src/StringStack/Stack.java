package StringStack;

//�������̽�
public interface Stack {

	//�߻� �޼��� - ���̸� ������ �뵵
	int length();

	//�߻� �޼��� - ���ϰ� object - �迭���� String���� �о� ��
	Object pop();

	//�߻� �޼��� - �Ű����� object - �迭���ٰ� String���� ����
	void push(Object o);
}
