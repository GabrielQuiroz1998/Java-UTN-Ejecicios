package EjercicioUnoClaseCinco;

public abstract class Descuento {
	private double valorDescuento;
	
	public Descuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;
	}
	public double asignarDescuento(double monto, double descuento) {
		return 0;
	}
	public double getValorDescuento() {
		return valorDescuento;
	}
	public void setValorDescuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;
	}
}
