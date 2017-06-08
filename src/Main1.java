
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv1=null;
		Audio audio =null;
		AirConditoner ac =null;
		Lights lights =null;
		WashingMachine wash =null;
		Remote r1;
		r1 = new Remote(tv1=new Tv(152,15));
		r1.tv.On();
		r1.tv.Volumeup();
		r1.tv.Channelup();
		r1.tv.Off();
		r1 = new Remote(audio=new Audio(14));
		r1.audio.On();
		r1.audio.Volumeup();
		r1.audio.Off();
		r1 = new Remote(ac=new AirConditoner(16));
		r1.ac.On();
		r1.ac.tempdown();
		r1.ac.tempup();
		r1 = new Remote(lights=new Lights());
		r1.l1.On();
		r1.l1.Off();
		r1 = new Remote(wash=new WashingMachine());
		r1.wash.On();
		r1.wash.wash();
		r1.wash.Off();
		
	}

}
