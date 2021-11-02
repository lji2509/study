class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL)
			return;
		
		prevchannel = this.channel;
		this.channel = channel;
		
	}
	
	int getChannel() {
		return channel;
	}

	
	void gotoPrevChannel() {
		setChannel(prevchannel);
	}
	
}
public class ex7_5 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}
	
	
}
