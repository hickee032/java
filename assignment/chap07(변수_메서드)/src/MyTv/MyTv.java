package MyTv;

public class MyTv {

	int prevChannel;

	int prevVolume;

	boolean isPowerOn = false;

	public void isPowerOn() {

		this.isPowerOn = !isPowerOn;

		return;

	}

	int volume = 0;

	final int MAX_VOLUME = 100;

	final int MIN_VOLUME = 0;

	public void setVolume(int volume) {

		if ((volume > MAX_VOLUME) || (volume < MIN_VOLUME)) {

			System.out.println("������ 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�.!");

		} else {

			return;

		}

	}

	public int getVolume() {

		int result = 0;

		if ((volume < MAX_VOLUME) && (volume > MIN_VOLUME)) {

			result = volume + 5;

		}

		System.out.println("���� vol : " + result);

		return result;

	}

	public int getoPrevVolume() {

		int result = 0;

		if ((volume < MAX_VOLUME) && (volume > MIN_VOLUME)) {

			result = volume;

		}

		System.out.println("���� vol : " + result);

		return result;

	}

	int channel;

	final int MAX_CHANNEL = 100;

	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {

		if ((channel > MAX_CHANNEL) || (channel < MIN_CHANNEL)) {

			System.out.println("ä���� 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�.!");

		} else {

			return;

		}

	}

	public int getChannel() {

		// int channel = 8;

		int result = 0;

		if ((channel < MAX_VOLUME) && (channel > MIN_VOLUME)) {

			result = channel + 7;

		}

		System.out.println("���� ch : " + result);

		return result;

	}

	public int getoPrevChannel() {

		int result = 0;

		if ((channel < MAX_VOLUME) && (channel > MIN_VOLUME)) {

			result = channel;

		}

		System.out.println("���� ch : " + result);

		return result;

	}

}
