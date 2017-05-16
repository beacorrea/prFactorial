package prFactorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void factorial0es1() {
		assertEquals(new Integer(1),new Integer(Factorial.calcular(0)));
	}
	@Test
	public void factorial1es1() {
		assertEquals(new Integer(1),new Integer(Factorial.calcular(1)));
	}
}
