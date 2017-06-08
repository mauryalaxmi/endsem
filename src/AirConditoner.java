
public class AirConditoner {
	public int flag=0;
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the ac are on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the ac are off");
			this.flag=0;
		}
	}
}
