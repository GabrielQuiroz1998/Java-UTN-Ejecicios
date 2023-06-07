package ClaseCuatro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjercicioTres {

	public static String codificar(String texto, int desplazo) {
		String abcdario = "abcdefghijklmnñopqrstuvwxyz";
		String textoCodificado = "";
		for(int x=0; x<texto.length(); x++) {
			for(int y=0; y<abcdario.length(); y++) {
				if(texto.charAt(x) == abcdario.charAt(y)) {
					if(y+desplazo >= abcdario.length()) {
						int indice = (y+desplazo) - abcdario.length();
						textoCodificado += abcdario.charAt(indice);
					}else {
						textoCodificado += abcdario.charAt(y+desplazo);
					}
				}
			}
			int contador = 0;
			for(int z=0; z<abcdario.length(); z++) {
				if(texto.charAt(x) != abcdario.charAt(z)) {
					contador++;
					if(contador == abcdario.length()) {
						textoCodificado += texto.charAt(x);
					}
				}
			}
		}
		return textoCodificado;
	}
	
	public static String decodificar(String texto, int desplazo) {
		String textoDecodificado = "";
		String abcdario = "abcdefghijklmnñopqrstuvwxyz";
		
		for(int x=0; x<texto.length(); x++) {
			for(int y=0; y<abcdario.length(); y++) {
				if(texto.charAt(x) == abcdario.charAt(y)) {
					if(y-desplazo < 0) {
						int indice = (y-desplazo) + abcdario.length();
						textoDecodificado += abcdario.charAt(indice);
					}else {
						textoDecodificado += abcdario.charAt(y-desplazo);
					}
				}
			}
			int contador =0;
			for(int z=0; z<abcdario.length(); z++) {
				if(texto.charAt(x) != abcdario.charAt(z)) {
					contador++;
					if(contador == abcdario.length()) {
						textoDecodificado += texto.charAt(x);
					}
				}
			}
		}
		return textoDecodificado;
	}
	
	public static void hacer(String decicion, int desplazo, String archivo1, String archivo2) throws IOException {
		if(decicion == "codificar") {
			Path pathRuta = Paths.get(archivo1);
			String textoAcumulado = Files.readString(pathRuta);
			String textoCodificado = codificar(textoAcumulado, desplazo);
			Path pathSalida = Paths.get(archivo2);
			Files.writeString(pathSalida, textoCodificado);
			System.out.println("Codificacion Exitosa!");
		}else if(decicion == "decodificar") {
			Path pathRuta = Paths.get(archivo1);
			String textoAcumulado = Files.readString(pathRuta);
			String textoCodificado = decodificar(textoAcumulado, desplazo);
			Path pathSalida = Paths.get(archivo2);
			Files.writeString(pathSalida, textoCodificado);
			System.out.println("Decodificacion Exitosa!");
		}else {
			System.out.println("Igreso invalido, vuelva a ejecutar el programa si asi lo desea");
		}
	}
	
	public static void main(String[] args) throws IOException {
		String ruta1 = "C:\\Users\\tatoc\\Desktop\\tato\\programacion\\JavaUTN\\ClaseCuatro\\src\\ClaseCuatro\\entrada.txt";
		String ruta2 = "C:\\Users\\tatoc\\Desktop\\tato\\programacion\\JavaUTN\\ClaseCuatro\\src\\ClaseCuatro\\salida.txt";
		hacer("codificar", 2, ruta1, ruta2);
	}

}
