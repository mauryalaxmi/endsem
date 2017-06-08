
public class Audio {
	public int flag=0;
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
}
