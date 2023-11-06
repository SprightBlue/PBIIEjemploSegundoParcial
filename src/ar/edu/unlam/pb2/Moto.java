package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte{
	
	private String patente;
	private final Integer CAPACIDAD_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.setPatente(patente);
		this.CAPACIDAD_MAXIMA_DE_PASAJEROS = 2;
		this.setVelocidadMaxima(velocidadMaxima);
	}

	public String getPatente() {
		return patente;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCAPACIDAD_MAXIMA_DE_PASAJEROS() {
		return CAPACIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
