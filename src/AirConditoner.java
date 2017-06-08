
public class AirConditoner {
	public int flag=0;
	private int temp;
	public AirConditoner(int temp) {
		this.temp=temp;
	}
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
	public void tempup(){
		On();
		if(flag==1)
		{
			this.setTemp(this.getTemp() + 1);
			
		}
	}
	public void tempdown(){
		On();
		if(flag==1)
		{
			this.setTemp(this.getTemp() - 1);	
		}
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
}
