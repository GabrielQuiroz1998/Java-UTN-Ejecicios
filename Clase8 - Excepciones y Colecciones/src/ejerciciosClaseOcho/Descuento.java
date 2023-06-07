package ejerciciosClaseOcho;

public abstract class Descuento {
	private double montoSinDescuento;
	private double cantidadDescuento;
	
	public Descuento(double montoSinDescuento, double cantidadDescuento) {
		this.montoSinDescuento = montoSinDescuento;
		this.setCantidadDescuento(cantidadDescuento);
	}

	public abstract double asignarDescuento();

	public double getMontoSinDescuento() {
		return montoSinDescuento;
	}

	public void setMontoSinDescuento(double montoSinDescuento) {
		this.montoSinDescuento = montoSinDescuento;
	}

	public double getCantidadDescuento() {
		return cantidadDescuento;
	}

	public void setCantidadDescuento(double cantidadDescuento) {
		this.cantidadDescuento = cantidadDescuento;
	}
	
	
}
