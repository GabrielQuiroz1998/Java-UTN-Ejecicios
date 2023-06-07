package TestEjerciciosClaseOcho;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ejerciciosClaseOcho.Carrito;
import ejerciciosClaseOcho.CarritoCeroException;
import ejerciciosClaseOcho.Descuento;
import ejerciciosClaseOcho.DescuentoFijo;
import ejerciciosClaseOcho.ItemCarrito;
import ejerciciosClaseOcho.MontoConDescuentoNegativoException;
import ejerciciosClaseOcho.NoHayStockException;
import ejerciciosClaseOcho.Producto;

public class DescuentosExceptionsTest {

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
	public final void testCarritoCeroException() {
		boolean excepcionLanzada = false;
		Carrito carrito = new Carrito();
		Producto prod1 = new Producto("Mermelada de Frutilla", 0, 10);
		ItemCarrito item = new ItemCarrito();
		try {
			//le estoy agregando cero productos por ende el valor del carrito va a ser cero
			item.agregarProductos(prod1, 10);
			carrito.setItemCarrito(item);
			} catch (NoHayStockException e) {
			System.out.println("No tenemos stock suficiente de: " + e.getProducto().getNombre());
		}
		Descuento descuentoF = new DescuentoFijo(carrito.costoFinalSinDescuentos(), 50);
		try {
			//esto va a fallar ya que el valor del carrito es cero y por ende no se le pueden agregar descuentos
			carrito.setDescuento(descuentoF);
			System.out.println("Costo final con descuento fijo: " + carrito.getCostoFinal());
			
		} catch(CarritoCeroException e){
			System.out.println(e.getMessage());
			excepcionLanzada = true;
		}
		assertTrue(excepcionLanzada);
		
	}
	
	@Test
	public final void testMontoConDescuentpNegativoException() {
		boolean excepcionLanzada = false;
		Carrito carrito = new Carrito();
		Producto prod1 = new Producto("Mermelada de Frutilla", 50, 10);
		ItemCarrito item = new ItemCarrito();
		try {
			item.agregarProductos(prod1, 10);
			carrito.setItemCarrito(item);
		} catch (NoHayStockException e) {
			System.out.println("No tenemos stock suficiente de: " + e.getProducto().getNombre());
		}
		Descuento descuentoF = new DescuentoFijo(carrito.costoFinalSinDescuentos(), 550);
		try {
			carrito.setDescuento(descuentoF);
			System.out.println("Costo final con descuento fijo: " + carrito.getCostoFinal());
		} catch(MontoConDescuentoNegativoException e){
			//el carrito tiene un valor de 500 y el descuento un valor de 550 por ende se va a lanzar la excepcion
			System.out.println(e.getMessage());
			excepcionLanzada = true;
		}
		assertTrue(excepcionLanzada);
	}


}
