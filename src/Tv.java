
public class Tv {
	public int flag=0;
	public int vol;
	public int channel;
	public  void On(){
		if(this.flag==0)
		{
			System.out.println("the lights are on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the lights are on");
			this.flag=0;
		}
	}
	public void Volumeup(int vol){
		vol++;
		this.vol=vol;
	}
	public void Volumedown (int vol){
		vol--;
		this.vol=vol;
	}
	public void Channelup(int channel){
		channel++;
		this.channel=channel;
	}
	public void Channeldown(int channel){
		channel--;
		this.channel=channel;
	}
}
