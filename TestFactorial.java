package prFactorial;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFactorial {
	
	@Parameters
	public static Collection<Integer[]> valores(){
		Integer[][] val = {{0,1},{1,1},{2,2},{3,6},{4,24},{5,120}};
		
		return Arrays.asList(val);
	}
	
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
	private int entrada,salida;
	
	public TestFactorial(int c, int s){
		entrada = c;
		salida = s;
	}
	
	@Test
	public void factorialEntradaSalida(){
		assertEquals(new Integer(salida),new Integer(Factorial.calcular(entrada)));
	}
}
