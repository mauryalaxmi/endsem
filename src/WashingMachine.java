
public class WashingMachine {
	public int flag=0;
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the washing machine on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the washing machine off");
			this.flag=0;
		}
	}
	public  void wash(){
		if(this.flag==1)
		{
			System.out.println("machine strated washing clothes");
		}
	}
}
