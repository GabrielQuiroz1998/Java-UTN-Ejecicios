package EjercicioUnoClaseCinco;

public class DescuentoPorcentaje extends Descuento{

	public DescuentoPorcentaje(double valorDescuento) {
		super(valorDescuento);
	}

	@Override
	public double asignarDescuento(double monto, double descuento) {
		double montoConDescuento = monto * descuento;
		return montoConDescuento;
	}

}
