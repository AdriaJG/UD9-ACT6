package objetos;

import java.lang.Math;

public class Espectador {
	String nombre;
	int edad;
	double dinero;
	
	public Espectador(int edad, double dinero) {
		super();
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public Espectador() {
		this.nombre = "Pepe";
		this.edad = (int) ((Math.random() * (99 - 1) + 1));
		this.dinero = (double) ((Math.random() * (9999 - 1) + 1));
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}


