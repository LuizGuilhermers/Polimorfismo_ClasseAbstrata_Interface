package AulaTres;

public class Calculando implements Calculos{
	
	@Override
	public int div (int valor1, int valor2) {
		return valor1 / valor2;
	}

	
	@Override
	public double mult (double valor1, double valor2) {
		return valor1 * valor2;
	}
	

	@Override
	public double somar (double valor1, double valor2) {
		return valor1 + valor2;
	}
	

	@Override
	public int exp (int valor1, int valor2) {
		return valor1^valor2;
	}
	
	@Override
	public double sub (double valor1, double valor2) {
		return valor1 - valor2;
	}



}
