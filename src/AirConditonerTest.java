import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirConditonerTest {
	AirConditoner ac1;
	@Before
	public void setUp() throws Exception {
		ac1 = new AirConditoner(15);
		
	}

	@Test
	public void testTempup() {
		//fail("Not yet implemented");
		ac1.On();
		ac1.tempup();
		assertEquals(16,ac1.getTemp());
	}

	@Test
	public void testTempdown() {
		//fail("Not yet implemented");
		ac1.On();
		ac1.tempdown();
		assertEquals(14,ac1.getTemp());
	}

}
