package Ejercicios;

public class EjerciocioUnoA {

	public static void main(String[] args) {		
		int numeroInicio = 5;
		int numeroFin = 14;
		while(numeroInicio <= numeroFin) {
			System.out.print(numeroInicio);
			if(numeroInicio < numeroFin) {
				System.out.print(", ");
			}
			numeroInicio++;
		}
	}
	
}
