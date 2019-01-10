import static org.junit.Assert.*;

import org.junit.Test;

public class sateliteTest {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	@Test
	public void testCosntructor1() {
		meridiano=10;
		paralelo=15;
		distancia_tierra=25;
		
		satelite sateliteTest= new satelite(meridiano,paralelo,distancia_tierra);
		assertEquals(sateliteTest.meridiano,10,0);
		assertEquals(sateliteTest.paralelo,15,0);
		assertEquals(sateliteTest.distancia_tierra,25,0);
	}
	@Test
	public void testCosntructor2() {
		
		satelite sateliteTest= new satelite();
		
		assertEquals(sateliteTest.meridiano,0,0);
		assertEquals(sateliteTest.paralelo,0,0);
		assertEquals(sateliteTest.distancia_tierra,0,0);
	}
	@Test
	public void testCosntructosr3() {
		
		satelite sateliteTest= new satelite();
		sateliteTest.setPosicion(345, 14, 55);
		assertEquals(sateliteTest.meridiano,345,0);
		assertEquals(sateliteTest.paralelo,14,0);
		assertEquals(sateliteTest.distancia_tierra,55,0);
		
	}
}
