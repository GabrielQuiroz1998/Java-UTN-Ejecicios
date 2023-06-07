package EjercicosClaseSiete;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	public DescuentoPorcentajeConTope(double valorDescuento) {
		super(valorDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double asignarDescuento(double monto, double descuento) {
		if(descuento > 0 && descuento <=50) {
			double montoConDescuento = descuento / 100;
			return monto * montoConDescuento;
		}
		if(descuento <= 0) {
			System.out.println("Descuento fallido! El monto del porcentaje es menor o igual a 0%");
		}else {
			System.out.println("Descuento fallido! El monto del porcentaje es mayor  a 50%");
		}
		
		return 0;
	}

}
