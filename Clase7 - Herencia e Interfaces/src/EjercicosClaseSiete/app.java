package EjercicosClaseSiete;


public class app {

	public static void main(String[] args) {
		Persona persona = new Persona("Gabriel", "Quiroz", "1998-07-25");
		Producto prod1 = new Producto("BMW", "12", 20);
		Carrito carrito = new Carrito(persona, prod1, prod1, prod1); 
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		Descuento desc = new DescuentoFijo(20);
		carrito.setDescuento(desc);
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		Descuento descPorcentaje = new DescuentoPorcentaje(10);
		carrito.setDescuento(descPorcentaje);
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		carrito.setDescuento(null);
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
		DescuentoPorcentajeConTope descPorTope = new DescuentoPorcentajeConTope(0);
		carrito.setDescuento(descPorTope);
		System.out.println("El costo final del carrito es de: $" + carrito.costoFinal());
	}

}
