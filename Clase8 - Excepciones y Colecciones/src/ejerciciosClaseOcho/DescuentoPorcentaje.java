package ejerciciosClaseOcho;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double asignarDescuento() {
		return this.getMontoSinDescuento() * this.getCantidadDescuento();
	}

	public DescuentoPorcentaje(double montoSinDescuento, double cantidadDescuento) {
		super(montoSinDescuento, cantidadDescuento);
		// TODO Auto-generated constructor stub
	}

	

}
