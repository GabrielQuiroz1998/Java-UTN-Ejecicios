package EjercicioUnoClaseCinco;


public class App {

	public static void main(String[] args) {
		//creo un objeto de la clase persona
		Persona persona = new Persona("Gabriel", "Quiroz", "1998-07-25");
		//creo un objeto de la clase Producto y le agrego su nombre, precio y stock
		Producto prod1 = new Producto("Mermelada de Frutilla", 20, 10);
		//creo un objeto de la clase itemCarrito
		ItemCarrito itemCarritoUno= new ItemCarrito();
		//solo va a funcionar si la cantidad de productos es manor o igual al stock del mismo
		itemCarritoUno.agregarProductos(prod1, 10);
		//creo un objeto de la clase carrito
		Carrito carrito = new Carrito();
		// le agrego una persona al carrito
		carrito.setPersona(persona);
		//le agrego un item al carrrito
		carrito.setItemCarrito(itemCarritoUno);
		//imprimo por pantalla el costo final del carrito(todavia no tiene descuento asi que el valor es precio*cantidad)
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		//creo un objeto de la clase descuentoFijo y le asigno un valor de $20
		Descuento desc = new DescuentoFijo(20);
		//le seteo ese descuento al carrito
		carrito.setDescuento(desc);
		//muestro por pantalla el resultado con el descuento fijo
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		//creo un objeto del tipo descuentoPorcentaje y le asigno un porcenaje de descuento
		Descuento descPorcentaje = new DescuentoPorcentaje(0.90);
		//le agrego un objeot de tipo descuentoPorcentaje al carrito(se borra el descuento anterior ya que solo se permite un tipo de descuento)
		carrito.setDescuento(descPorcentaje);
		//imprimo el nuevo precio del carrito con el descuento por porcentaje
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		//le elimino el descuento al carrito 
		carrito.setDescuento(null);
		//imprimo el precio original sin descuento
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
	}

}
