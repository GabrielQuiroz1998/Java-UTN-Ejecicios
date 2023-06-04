package ClaseCuatro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioDos {

	public static int operacionListaDeNumeros(String ruta, String decicion) throws NumberFormatException, IOException {
		int number = 0;
		if(decicion.equals("sumar")) {	
			number = sumarListaDeNumeros(ruta);
		}else if(decicion.equals("multiplicar")){
			number = multiplicarListaDeNumeros(ruta);
		}else {
			System.out.println("Ingreso invalido, vuelva a ejecutar el programa nuevamente");
		}
		return number;
	}
	
	public static int sumarListaDeNumeros(String ruta) throws NumberFormatException, IOException {
		Path pathRuta = Paths.get(ruta);
		int number =0;
		for (String numero : Files.readAllLines(pathRuta)){
			number += Integer.parseInt(numero);
		}
		return number;
	}
	
	public static int multiplicarListaDeNumeros(String ruta) throws NumberFormatException, IOException {
		Path pathRuta = Paths.get(ruta);
		int number = 0;
		int contadorNumeros = Files.readAllLines(pathRuta).size();
		int numeros[] = new int[contadorNumeros];
		int incrementador = 0;
		for (String numero : Files.readAllLines(pathRuta)){
			numeros[incrementador] = Integer.parseInt(numero);
			incrementador++;
		}
		number = numeros[0]; 
		for(int x=1; x<numeros.length; x++) {
			number*= numeros[x];
		}
		return number;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Ingrese la oparacion sumar/multiplicar");
			String decicion = scn.next();
			int sumaTotal = operacionListaDeNumeros(args[0], decicion);
			System.out.println("Resultado: " + sumaTotal);		
			}
	}
}
