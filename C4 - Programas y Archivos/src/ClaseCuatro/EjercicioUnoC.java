package ClaseCuatro;

import java.util.Scanner;

public class EjercicioUnoC {
	
	public static int[] ordenarNumeros() {
			try (Scanner scn = new Scanner(System.in)) {
				System.out.println("Ingrese los 3 Nros° separados por espacio");
				int num1 = scn.nextInt();
				int num2 = scn.nextInt();
				int num3 = scn.nextInt();
				System.out.println("Ingrese el orden ascendente o decreciente(a/d)");
				String orden = scn.next();
				int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, orden);
				return numerosOrdenados;
			}
	}
	
	public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
		int[] numeros = {num1, num2, num3};
		if(orden.equals("a")) {
			while(numeros[1] < numeros[0] || numeros[1] > numeros[2]) {
				for(int x=0; x<numeros.length-1; x++) {
					if(numeros[x]>numeros[x+1]) {
						int temporal = numeros[x+1];
						numeros[x+1] = numeros[x];
						numeros[x] = temporal;
					}
				}
			}
		}else if(orden.equals("d")) {
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
//		int num1 = 55;
//		int num2 = 33;
//		int num3 = 77;
//		String orden = "d";
		int[] numerosOrdenados = ordenarNumeros();//descomentar y pasar los datos por parametro
		//para usar el metodo con parametros desde el main
		for(int s=0; s<numerosOrdenados.length; s++) {
			System.out.println(numerosOrdenados[s]);
		}
	}

}
