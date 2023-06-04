package Ejercicios;

public class EjercicioUnoB {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		while(numeroInicio <= numeroFin) {
			if(numeroInicio%2 == 0) {
				System.out.print(numeroInicio);
				if(numeroInicio < numeroFin) {
					System.out.print(", ");
				}
			}
			numeroInicio++;
		}

	}

}
