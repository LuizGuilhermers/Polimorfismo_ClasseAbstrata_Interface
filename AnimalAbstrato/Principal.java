package AnimalAbstrato;



public class Principal {

	public static void main(String[] args) {

		Lobo lobopreto = new Lobo ("Thor", "Macho", "NI");
		lobopreto.correr();
		lobopreto.dormir ();
		lobopreto.emitirSom();
		lobopreto.caminhar();

	}
}
