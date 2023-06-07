package ClaseSeis;

public class Calculadora {
	public double sumar(double num1, double num2) {
		double suma = num1+num2;
		if((suma % 2) == 0) {
			int sumaInt = (int) suma;
			return sumaInt;
		}
		return num1 + num2;
	}
	
	public double restar(double num1, double num2) {
		double resta = num1-num2;
		if((resta % 2) == 0) {
			int restaInt = (int) resta;
			return restaInt;
		}
		return num1-num2;
		}
	
	public double multiplicar(double num1, double num2) {
		double multi = num1*num2;
		if((multi % 2) == 0) {
			int multiInt = (int) multi;
			return multiInt;
		}
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) {
		double divi = num1/num2;
		if((divi % 2) == 0) {
			int diviInt = (int) divi;
			return diviInt;
		}
		return num1/num2;
	}
}
