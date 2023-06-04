package ClaseTres;

public class EjercicioDos {
	
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
	
	public static void main(String[] args) {
		int desplazo = 2;
		String texto = "vengo del barrio de boedo, barrio de murga y carnaval";
		String textoCodificado = codificar(texto, desplazo);
		System.out.println(textoCodificado);
		String textoDecodificado = decodificar(textoCodificado, desplazo);
		System.out.println(textoDecodificado);
	}

}
