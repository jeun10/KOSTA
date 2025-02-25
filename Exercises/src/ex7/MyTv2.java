package ex7;

public class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	private int prvChannel;

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		prvChannel=this.channel;
		//setPrvChannel(this.channel);
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

	public int getPrvChannel() {
		return prvChannel;
	}

	public void setPrvChannel(int prvChannel) {
		this.prvChannel = prvChannel;
	}

	public void gotoPrevChannel() {
		setChannel(prvChannel);
	}

}
