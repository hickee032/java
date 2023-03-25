package sec01_List.exam05_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> mg = new LinkedList<Message>();

		mg.offer(new Message("sendMail", "홍길동"));
		mg.offer(new Message("sendSMS", "신은혁"));
		mg.offer(new Message("sendKakao", "리수"));
		mg.offer(new Message("sendFeme", "재인"));

//		mg.add(new Message("sendMail", "쏭"));

		while (!mg.isEmpty()) {
			Message message = mg.poll();

			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "에게 메세지를 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
				break;

			case "sendKakao":
				System.out.println(message.getTo() + "에게 톡를 보냅니다.");
				break;
			case "sendFeme":
				System.out.println(message.getTo() + "에게 Feme를 보냅니다.");
				break;

			default:
				break;
			}

		}

	}

}
