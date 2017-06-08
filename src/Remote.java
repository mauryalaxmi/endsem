
public class Remote  {
	Tv tv;
	Audio audio;
	AirConditoner ac;
	Lights l1;
	WashingMachine wash;
	public Remote(Object obj) {
		// TODO Auto-generated constructor stub
		if(obj instanceof Tv )
		{
				tv=(Tv)obj;
		}
		else if(obj instanceof Audio)
		{
			   audio=(Audio)obj;
		}
		else if(obj instanceof AirConditoner)
		{
				ac=(AirConditoner)obj;
		}
		else if(obj instanceof Lights)
		{
			   l1=(Lights)obj;
		}
		else if(obj instanceof WashingMachine)
		{
			   wash=(WashingMachine)obj;
		}
	}
}


