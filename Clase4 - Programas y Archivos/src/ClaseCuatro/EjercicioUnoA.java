package ClaseCuatro;

public class EjercicioUnoA {

	public static int[] ordenarNumeros(int num1, int num2, int num3, char orden) {
		int[] numeros = {num1, num2, num3};
		if(orden == 'a') {
			while(numeros[1] < numeros[0] || numeros[1] > numeros[2]) {
				for(int x=0; x<numeros.length-1; x++) {
					if(numeros[x]>numeros[x+1]) {
						int temporal = numeros[x+1];
						numeros[x+1] = numeros[x];
						numeros[x] = temporal;
					}
				}
			}
		}else if(orden == 'd') {
			while(numeros[1] > numeros[0] || numeros[1] < numeros[2]) {
				for(int x=0; x<numeros.length-1; x++) {
					if(numeros[x]<numeros[x+1]) {
						int temporal = numeros[x+1];
						numeros[x+1] = numeros[x];
						numeros[x] = temporal;
					}
				}
			}
		}
		return numeros;
	}
	
	public static void main(String[] args) {
		int num1 = 38;
		int num2 = 47;
		int num3 = 24;
		char orden = 'a';
		
		int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, orden);
		for(int s=0; s<numerosOrdenados.length; s++) {
			System.out.println(numerosOrdenados[s]);
		}

	}

}
