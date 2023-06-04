package ClaseSeisTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ClaseSeis.Calculadora;

public class CalculadoraTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testPuntoUno() {
		//1. El resultado de multiplicar 80 por 3 da 240
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.multiplicar(80, 3) == 240);
	}

	@Test
	public final void testPuntoDos() {
		//2. El resultado de sumar 150 y 180, dividido por 3, da 110
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.sumar(150, 180)/3 == 110);
	}

	@Test
	public final void testPuntoTres() {
		//3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
		Calculadora calculadora = new Calculadora();
		assertFalse(calculadora.restar(90, 50) * 15 == 650);
	}

	@Test
	public final void testPuntoCuatro() {
		//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
		Calculadora calculadora = new Calculadora();
		//no da error por que el resultado no coincide ya que 110 *25 es igual a 2750
		assertFalse(calculadora.sumar(70, 40) * 25 == 2700);
	}
}
