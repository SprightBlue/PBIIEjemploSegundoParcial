package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	
	private String nombre;
	private List<MedioTransporte> vehiculos;

	public Mapa(String nombre) {
		this.setNombre(nombre);
		vehiculos = new ArrayList<MedioTransporte>();
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarVehiculo(MedioTransporte vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	public Integer getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}

	public boolean hayCoalicion() throws ColitionException {
		for(MedioTransporte vehiculo1: this.vehiculos) {
			for(MedioTransporte vehiculo2: this.vehiculos) {
				if(!vehiculo1.equals(vehiculo2) && vehiculo1.getLatitud().equals(vehiculo2.getLatitud()) && vehiculo1.getLongitud().equals(vehiculo2.getLongitud())) {
					throw new ColitionException();
				}
			}
		}
		return false;
	}

}
