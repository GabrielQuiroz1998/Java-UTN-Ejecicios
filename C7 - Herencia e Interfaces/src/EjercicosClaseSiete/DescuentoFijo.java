package EjercicosClaseSiete;

public class DescuentoFijo extends Descuento{

	public DescuentoFijo(double valorDescuento) {
		super(valorDescuento);
	}

	@Override
	public double asignarDescuento(double monto, double descuento) {
		if(monto - descuento > 0) {
			return descuento;
		}
		return 0;
	}
	
}
