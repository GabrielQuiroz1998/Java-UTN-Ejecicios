package ejerciciosClaseOcho;

public class DescuentoFijo extends Descuento{

	public DescuentoFijo(double montoSinDescuento, double cantidadDescuento) {
		super(montoSinDescuento, cantidadDescuento);
		
	}

	@Override
	public double asignarDescuento() {
		return this.getMontoSinDescuento() - this.getCantidadDescuento();
	}

	
	
}
