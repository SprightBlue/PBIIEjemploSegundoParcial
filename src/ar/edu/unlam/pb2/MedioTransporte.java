package ar.edu.unlam.pb2;

public abstract class MedioTransporte {
	
	protected Double latitud;
	protected Double longitud;
	
	public MedioTransporte(Double latitud, Double longitud) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

	public Double getLatitud() {
		return latitud;
	}

	protected void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	protected void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

}
