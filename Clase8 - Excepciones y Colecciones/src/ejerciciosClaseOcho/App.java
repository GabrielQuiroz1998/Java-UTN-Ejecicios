package ejerciciosClaseOcho;

public class App {

	public static void main(String[] args) {
		Carrito carrito = new Carrito();
		Persona tato = new Persona("Tato", "Quiroz", "1998-07-25");
		carrito.setPersona(tato);
		Producto prod1 = new Producto("Mermelada de Frutilla", 10, 10);
		ItemCarrito item = new ItemCarrito();
		try {
			item.agregarProductos(prod1, 10);
			carrito.setItemCarrito(item);
			System.out.println("Se agraron los productos con exito");
			System.out.println("El costo del carrito es de: $" + carrito.costoFinalSinDescuentos());
		} catch (NoHayStockException e) {
			System.out.println("No tenemos stock suficiente de: " + e.getProducto().getNombre());
		}
		Descuento descuentoF = new DescuentoFijo(carrito.costoFinalSinDescuentos(), 10);
		try {
			carrito.setDescuento(descuentoF);
			System.out.println("Descuento fijo de $10 agregado con exito");
			System.out.println("Costo final con descuento fijo: " + carrito.getCostoFinal());
		} catch (CarritoCeroException e) {
			System.out.println(e.getMessage());
			
		} catch (MontoConDescuentoNegativoException e) {
			System.out.println(e.getMessage());
		}	
		
		Descuento descuentoP = new DescuentoPorcentaje(carrito.costoFinalSinDescuentos(), 0.80);
		try {
			carrito.setDescuento(descuentoP);
			System.out.println("Descuento porcentual del 20% agregado con exito");
			System.out.println("Costo final con descuento porcentual: " + carrito.getCostoFinal());
		} catch (CarritoCeroException e) {
			System.out.println(e.getMessage());
			
		} catch (MontoConDescuentoNegativoException e) {
			System.out.println(e.getMessage());
		}
	}
		

}
