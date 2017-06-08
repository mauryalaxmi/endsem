import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AudioTest {
	Audio a1;
	@Before
	public void setUp() throws Exception {
		a1 = new Audio(12);
	}

	@Test
	public void testVolumeup() {
		//fail("Not yet implemented");
		a1.On();
		a1.Volumeup();
		assertEquals(13,a1.getVol());
	}

	@Test
	public void testVolumedown() {
		//fail("Not yet implemented");
		a1.On();
		a1.Volumedown();
		assertEquals(11,a1.getVol());
	}

}
