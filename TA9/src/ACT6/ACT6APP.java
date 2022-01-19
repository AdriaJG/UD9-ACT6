package ACT6;

import objetos.Espectador;
import objetos.SalaCine;

public class ACT6APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaCine sala1 = new SalaCine();
		Espectador cliente = new Espectador();
		
		sala1.mostrarSala();
		
		//Llenamos la sala con clientes
		
		while (sala1.encontrarAsiento(cliente)) {
			sala1.mostrador(cliente);
			sala1.mostrarSala();
			cliente = new Espectador();
		}
	}

}
