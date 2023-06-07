package ClaseTres;

public class EjercicioUnoB {
	
	public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
		int[] numeros = {num1, num2, num3};
		if(orden == "ascendente") {
			while(numeros[1] < numeros[0] || numeros[1] > numeros[2]) {
				for(int x=0; x<numeros.length-1; x++) {
					if(numeros[x]>numeros[x+1]) {
						int temporal = numeros[x+1];
						numeros[x+1] = numeros[x];
						numeros[x] = temporal;
					}
				}
			}
		}else if(orden == "decreciente") {
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
		// Dados 3 números y un orden (ascendente o decreciente) que ordene los
		//mismos y los retorne en un vector de 3
		int num1 = 38;
		int num2 = 47;
		int num3 = 24;
		String orden = "decreciente";
		
		int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, orden);
		for(int s=0; s<numerosOrdenados.length; s++) {
			System.out.println(numerosOrdenados[s]);
		}
	}

}
