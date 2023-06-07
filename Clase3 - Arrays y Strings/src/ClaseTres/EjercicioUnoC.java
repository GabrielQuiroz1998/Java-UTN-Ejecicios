package ClaseTres;

public class EjercicioUnoC {
	
	public static int sumarNumerosMayoresAX(int[] numeros, int numeroX) {
		int resultado = 0;
		for(int x=0; x<numeros.length; x++) {
			if(numeros[x] > numeroX) {
				resultado+= numeros[x];
			}
		}
		return resultado;
	}	

	public static void main(String[] args) {
//		dado un vector de números, y un número X, que sume todos los números > X y
//		retorne el resultado
		int[] numeros = {34, 21, 42, 64, 77, 8, 12, 54, 23, 59};
		int numeroX = 37; 
		
		int resultado = sumarNumerosMayoresAX(numeros, numeroX);
		System.out.println("El resultado es: " + resultado);
	}

}
