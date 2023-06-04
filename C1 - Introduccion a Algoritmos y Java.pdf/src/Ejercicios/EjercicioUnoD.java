package Ejercicios;

public class EjercicioUnoD {

	public static void main(String[] args) {
		// Utilizando la sentencia for hacer lo mismo que en (b) pero invirtiendo el orden
		int numeroInicio = 14;
		int numeroFin = 5;
		while(numeroInicio >= numeroFin) {
			if(numeroInicio%2 == 0) {
				System.out.print(numeroInicio);
				if(numeroInicio > numeroFin+1) {
					System.out.print(", ");
				}
			}
			numeroInicio--;
		}
	}

}
