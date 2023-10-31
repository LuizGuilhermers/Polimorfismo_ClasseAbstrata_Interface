package AulaTres;

public class Principal {
	
	public static void main (String[]args) {
		
		Calculando calculando = new Calculando ();
		
		System.out.println("A soma é: " + calculando.somar(10,10));
		System.out.println("A subtração:" + calculando.sub(10,10));
		System.out.println("A multiplicação é: " + calculando.mult(10,10));
		System.out.println("A divisão é: " + calculando.div(10,10));
		System.out.println("A exponenciação é: " + calculando.exp(10,10));
		
		
	}
	
	

}
