
public class lights {
	public int flag=0;
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the lights are on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the lights are off");
			this.flag=0;
		}
	}
}
