class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL)
			return;
			
		this.channel = channel;
	}
	
	int getChannel() {
		return channel;
	}
	
	void setVolume(int volume) {
		if(volume<MIN_VOLUME || volume>=MAX_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	int getVolume() {
		return volume;
	}
	
}
public class ex7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(100);
		System.out.println("CH : " +t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " +t.getVolume());
		
	}
}
	


