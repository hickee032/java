package sec01_exam_ContentSender;

//�߻�Ŭ������? 1���̻��� �߻� �޼��带 ���� �ϰ��ִ� Ŭ����
//�߻�Ŭ������ �ν��Ͻ��� �����Ҽ� ����.
public abstract class ContentSender {

	//�ʵ�
	String title;
	String nm;
	
	public ContentSender(String title,String nm) {
		this.title = title;
		this.nm = nm;
	}
	//�߻�޼��� ����� ���ؼ� �ݵ�� ������ (�������̵�) �Ǿ�߸�
	//��μ� �ν��Ͻ��� �����Ҽ� �ִ�.(�߿�)
	abstract void sendMsg(String content);
}
