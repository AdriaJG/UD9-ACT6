package objetos;

public class Asiento {
	
	Espectador espectador;

	public Asiento(Espectador espectador) {
		super();
		this.espectador = espectador;
	}
	
	public Asiento() {
		this.espectador = null;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	public boolean tieneEspectador () {
		return espectador == null;
	}
}
