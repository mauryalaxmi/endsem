
public class AirConditoner {
	public int flag=0;
	private int temperature;
	public AirConditoner(int temperature) {
		this.temperature=temperature;
	}
	public  void On()
	{
		if(this.flag==0)
		{
			System.out.println("the ac on");
			this.flag=1;
		}
	}
	public  void Off(){
		if(this.flag==1)
		{
			System.out.println("the ac off");
			this.flag=0;
		}
	}
	public void tempup(){
		//On();
		if(flag==1)
		{
			this.setTemp(this.getTemp() + 1);
			printTemperature();
		}
	}
	private void printTemperature() {
		System.out.println("the temp is :" + temperature);
	}
	public void tempdown(){
		//On();
		if(flag==1)
		{
			this.setTemp(this.getTemp() - 1);
			printTemperature();
		}
	}
	public int getTemp() {
		return temperature;
	}
	public void setTemp(int temp) {
		this.temperature = temp;
	}
}
