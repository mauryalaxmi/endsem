
public class Tv {
	public int flag=0;
	public int vol;
	public int channel;
	public Tv(int channel,int volume) {
		this.channel=channel;
		this.vol=volume;
	}
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the tv on");
			this.flag=1;
		}
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the tv off");
			this.flag=0;
		}
	}
	public void Volumeup(){
		if(flag==1)
		{
			this.vol++;
			printvol();
		}
	}
	private void printvol() {
		System.out.println("the volume is:" + this.vol);
	}
	private void printChannel() {
		System.out.println("the channel is:" + this.channel);
	}
	public void Volumedown (){
		if(flag==1)
		{
			this.vol--;
			printvol();
		}
	}
	public void Channelup(){
		if(flag==1)
		{
			this.channel++;
			printChannel();
		}
	}
	public void Channeldown(){
		if(flag==1)
		{
			this.channel--;
			printChannel();
		}
	}
}
