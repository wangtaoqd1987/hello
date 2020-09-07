import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSearchTest {

	private static BSearch bs = new BSearch();
	
	@BeforeEach
	void setUp() throws Exception {
		bs.data.add(2);
		bs.data.add(3);
		bs.data.add(44);
		bs.data.add(55);
		bs.data.add(66);
		bs.data.add(77);
	}

	@Test
	void testBSearch() {
		assertEquals(2, bs.bSearch(44));
	}
	
	
	@Test
	void testBSearchLow() {
		assertEquals(0, bs.bSearch(2));
	}
}
