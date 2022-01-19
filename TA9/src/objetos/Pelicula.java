package objetos;

public class Pelicula {
	String titulo;
	double duracion;
	int edadMinima;
	String director;
	
	public Pelicula(String titulo, double duracion, int edadMinima, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	
	public Pelicula() {
		this.titulo = "El programa de pepe";
		this.duracion = 1;
		this.edadMinima = (int) ((Math.random() * (99 - 1) + 1));;
		this.director = "Pepe";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
}
