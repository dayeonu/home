class Tv {
	private boolean power;
	int channel;
		
	public Tv(int channel ) {
		this(false,channel);
	}
	
	public Tv(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}
	
	
	int getchannel() {
		return channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	boolean getPower() {
		return power;
	}
	void power()		{ power = ! power; }
	void channelUp()	{	++ channel;	}
	void channelDown()	{	-- channel;	}
}

class CaptionTv extends Tv {
	
	public CaptionTv()	{}
	public CaptionTv(int channel, boolean caption)	{
		super(channel);
		this.caption = caption;
	}
	
	public CaptionTv(boolean power, int channel, boolean caption) {
		super(power,channel);
		this.caption = caption;
	}
	
	private boolean caption;
	
	public boolean isCaption() {
		return caption;
	}

	public void setCaption(boolean caption) {
		this.caption = caption;
	}

	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest	{
	
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv(10,true);
//		ctv.channel = 10;
		ctv.channelUp();
		ctv.setChannel(20);
//		System.out.println(ctv.channel);
		System.out.println(ctv.getChannel());
		ctv.displayCation("Hello, world");
//		ctv.caption= true;
		
		ctv.setCaption(true);
		ctv.displayCation("Hello, world");
	}

}
