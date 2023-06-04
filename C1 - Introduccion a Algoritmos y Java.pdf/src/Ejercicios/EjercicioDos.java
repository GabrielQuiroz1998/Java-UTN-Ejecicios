package Ejercicios;

public class EjercicioDos {

	public static void main(String[] args) {
		double ingresosMensuales = 323.921;
		int vehiculosAntiguedadMenor5Años = 2;
		int cantInmuebles = 1;
		boolean activosSocietariosEmbarcacionAeronave = false;
		
		if(ingresosMensuales > 489.083 || vehiculosAntiguedadMenor5Años >= 3 || 
				cantInmuebles >= 3 || activosSocietariosEmbarcacionAeronave) {
			System.out.println("Usted pertenece al segmento de ingresos altos");
		}else {
			System.out.println("Usted No pertenece al segmento de ingresos altos");
		}

	}

}
