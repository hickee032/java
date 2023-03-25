package sec01_List.exam05_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> mg = new LinkedList<Message>();

		mg.offer(new Message("sendMail", "ȫ�浿"));
		mg.offer(new Message("sendSMS", "������"));
		mg.offer(new Message("sendKakao", "����"));
		mg.offer(new Message("sendFeme", "����"));

//		mg.add(new Message("sendMail", "��"));

		while (!mg.isEmpty()) {
			Message message = mg.poll();

			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "���� �޼����� �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "���� SMS�� �����ϴ�.");
				break;

			case "sendKakao":
				System.out.println(message.getTo() + "���� �带 �����ϴ�.");
				break;
			case "sendFeme":
				System.out.println(message.getTo() + "���� Feme�� �����ϴ�.");
				break;

			default:
				break;
			}

		}

	}

}
