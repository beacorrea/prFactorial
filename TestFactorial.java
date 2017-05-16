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
	@Test
	public void factorial2es2() {
		assertEquals(new Integer(2),new Integer(Factorial.calcular(2)));
	}
	@Test
	public void factorial3es6() {
		assertEquals(new Integer(6),new Integer(Factorial.calcular(3)));
	}
	@Test
	public void factorial4es24() {
		assertEquals(new Integer(24),new Integer(Factorial.calcular(4)));
	}
	@Test
	public void factorial5es120() {
		assertEquals(new Integer(120),new Integer(Factorial.calcular(5)));
	}
}
