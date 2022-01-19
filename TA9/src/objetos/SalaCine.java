package objetos;

import java.util.Iterator;

public class SalaCine {
	Pelicula pelicula;
	double precioEntrada;
	Asiento[][] butacas = new Asiento[8][9];
	
	public SalaCine(Pelicula pelicula, double precioEntrada) {
		super();
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
		generarButacas();
	}
	
	public SalaCine() {
		this.pelicula = new Pelicula();
		this.precioEntrada = (double) ((Math.random() * (9999 - 1) + 1));
		generarButacas();
	}
	
	//Generador de butacas vacias
	
	public void generarButacas() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = new Asiento();
			}
		}
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Asiento[][] getButacas() {
		return butacas;
	}

	public void setButacas(Asiento[][] butacas) {
		this.butacas = butacas;
	}
	
	//Metodo para mostrar la sala
	
	public void mostrarSala() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				System.out.print("|" + i + (char)(j + 65));
				if (butacas[i][j].tieneEspectador()) {
					System.out.print(" libre|");
				} else {
					System.out.print(" ocupado|");
				}
			}
			
			System.out.println("");
		}
	}
	
	//Miramos si tiene la edad minima
	
	public boolean edadMinima(Espectador cliente) {
		return cliente.getEdad() >= pelicula.getEdadMinima();
	}
	
	//Miramos si tiene dinero suficiente
	
	public boolean dineroEntrada (Espectador cliente) {
		return cliente.dinero >= precioEntrada;
	}
	
	//Buscamos un asiento libre
	
	public boolean encontrarAsiento(Espectador client) {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if(butacas[i][j].tieneEspectador()) {
					butacas[i][j].setEspectador(client);
					return true;
				}
			}
		}
		return false;
	}
	
	//Comprovamos que el cliente cumpla los requisitos de la pelicula
	
	public void mostrador(Espectador cliente) {
		if(edadMinima(cliente) && dineroEntrada(cliente)) {
			if (encontrarAsiento(cliente)) {
				System.out.println("Asiento comprado correctamente");
			} else {System.out.println("Asientos ocupados");}
		} else { System.out.println("No podemos venderle una entrada");}
	}
}
