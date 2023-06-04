package ClaseTres;

public class EjerciocioUnoA {

	public static void main(String[] args) {
		String texto = "vengo del barrio de boedo, barrio de murga y carnaval";
		char letra = 'a';
		int contador = 0;
		
		for(int x=0; x<texto.length(); x++) {
			if(texto.charAt(x) == letra) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que se encontro la letra '"+ letra +
				"' es de: " + contador);
	}

}
