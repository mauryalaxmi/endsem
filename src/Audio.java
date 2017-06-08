
public class Audio {
	public int flag=0;
	public int vol;
	public Audio(int vol) {
		this.vol=vol;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the audio  on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the audio off");
			this.flag=0;
		}
	}
	public void Volumeup(){
		On();
		if(flag==1)
		{
			this.vol++;
			
		}
	}
	public void Volumedown (){
		On();
		if(flag==1)
		{
			this.vol--;
			
		}
	}
}
