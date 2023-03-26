package sec_verify04;

public class Audio {

	private String brand;
	private String quality;
	private int channel;

	public Audio(String brand, String quality, int channel) {
		this.brand = brand;
		this.quality = quality;
		this.channel = channel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}
