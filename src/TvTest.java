import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TvTest {
	Tv tv1;
	@Before
	public void setUp() throws Exception {
		tv1 =new Tv(152,15);
		tv1.setChannel(152);
		tv1.setVol(15);
	}

	@Test
	public void testVolumeup() {
		//fail("Not yet implemented");
		tv1.On();
		tv1.Volumeup();
		assertEquals(16,tv1.getVol());
	}

	@Test
	public void testVolumedown() {
		//fail("Not yet implemented");
		tv1.On();
		tv1.Volumedown();
		assertEquals(14,tv1.getVol());
	}

	@Test
	public void testChannelup() {
		//fail("Not yet implemented");
		tv1.On();
		tv1.Channelup();
		assertEquals(153,tv1.getChannel());
	}

	@Test
	public void testChanneldown() {
		//fail("Not yet implemented");
		tv1.On();
		tv1.Channeldown();
		assertEquals(151,tv1.getChannel());
	}

}
