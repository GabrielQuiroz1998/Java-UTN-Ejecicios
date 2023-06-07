package Ejercicios;

public class EjercicioUnoC {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		String parOImpar = "impar";
		//el programa solo va a funcionear si el ultimo numero es par
		while(numeroInicio <= numeroFin) {
			if(parOImpar == "par") {
				if(numeroInicio%2 == 0) {
					System.out.print(numeroInicio);
					if(numeroInicio < numeroFin) {
						System.out.print(", ");
					}
				}
			}else if(parOImpar == "impar") {
				if(numeroInicio%2 != 0) {
					System.out.print(numeroInicio);
					if(numeroInicio < numeroFin -1) {
						System.out.print(", ");
					}
				}
			}
			
			numeroInicio++;
		}

	}

}
