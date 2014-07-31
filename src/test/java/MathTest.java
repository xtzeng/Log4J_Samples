import org.junit.Test;


public class MathTest {

	@Test
	public void testRound() {
		Long a = Math.round(-8.5);
		Long b = Math.round(-8.8);
		Long c = Math.round(8.1);
		Long d = Math.round(8.7);
		System.out.println("round========"+c);
	}
	
	public void testRandom() {
		
		double d = Math.random()*50 + 50;
		System.out.println("random============" +d);
	}
}
