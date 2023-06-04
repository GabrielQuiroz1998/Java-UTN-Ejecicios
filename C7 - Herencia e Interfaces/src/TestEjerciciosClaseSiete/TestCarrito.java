package TestEjerciciosClaseSiete;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import EjercicosClaseSiete.Carrito;
import EjercicosClaseSiete.Descuento;
import EjercicosClaseSiete.DescuentoFijo;
import EjercicosClaseSiete.DescuentoPorcentaje;
import EjercicosClaseSiete.DescuentoPorcentajeConTope;
import EjercicosClaseSiete.Producto;

public class TestCarrito {

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
	public final void testCostoFinalUno() {
		//test que verifica que me carga los productos al carrito
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		assertNotNull(carrito.getProd1());	
	}
	
	@Test
	public final void testCostoFinalDos() {
		//test que verifica que funciona el metodo costoFinal del carrito
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		//le agrego un producto de $20 y pregunto si el costoFinal es de $20
		assertTrue(carrito.costoFinal() == 20);
	}
	
	@Test
	public final void testCostoFinalTres() {
		// test para vferificar que funciona el descuento dentro del metodo costoFinal del carrito
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		carrito.setProd2(prod1);
		carrito.setProd3(prod1);
		//el valor del carrito es de $60 ya que le agregue 3 productos de $20
		//creo un objeto del tipo descuentoFijo con el valor de $30
		Descuento desc = new DescuentoFijo(30);
		//le asigno ese descuento al carrito
		carrito.setDescuento(desc);
		//pregunto si el costo final del carrito es igual a 30 ya que valia 60 y le hice un descuento fijo de 30
		assertTrue(carrito.costoFinal() == 30);
	}
	
	@Test
	public final void testDescuentoFijo() {
		//test para corroborar el correcto funcionamiento de la clase DescuentoFijo
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		//creo un objeto del tipo descuentoFijo con un valor de $10
		Descuento desc = new DescuentoFijo(10);
		//le asigno ese descuento al carrito(que tiene un costo de $20)
		carrito.setDescuento(desc);
		//compruebo que el descuento fue asignado correctamente
		assertTrue(carrito.costoFinal() == 10);
	}
	
	@Test
	public final void testDescuentoPorcentaje() {
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		carrito.setProd2(prod1);
		//creo un objeto de la clase DescuentoPorcentaje y le doy un valor del 10%
		Descuento desc = new DescuentoPorcentaje(10);
		carrito.setDescuento(desc);
		//costoFinal del carrito sin descuento $40, con el descuento del 10% se va a $36
		assertTrue(carrito.costoFinal() == 36);
	}
	
	@Test
	public final void testDescuentoPorcentajeConTope() {
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito();
		carrito.setProd1(prod1);
		carrito.setProd2(prod1);
		//creo un objeto de la clase DescuentoPorcentaje y le doy un valor del 60%
		Descuento desc = new DescuentoPorcentajeConTope(0);
		carrito.setDescuento(desc);
		// solo se permiten descuentos mayores a 0% y menores o igual a 50%, por ende el descuento no se agrega
		assertTrue(carrito.costoFinal() == 40);
	}

}
