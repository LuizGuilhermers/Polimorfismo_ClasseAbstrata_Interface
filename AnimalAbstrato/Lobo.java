package AnimalAbstrato;

public class Lobo extends Animal{
	
	public Lobo (String nome, String sexo, String raca) {
		super (nome, sexo,  raca);
	}
		
		@Override
		public void caminhar () { 
			System.out.println("O carro está acelerando.");
		}

		@Override
		public void dormir() {
			System.out.println("O carro está freando.");
		}


		@Override
		public void correr() {
			System.out.println("O carro está virando.");
		}


		@Override
		public void emitirSom() { 
			System.out.println("o carro está ligado.");
		}

}
