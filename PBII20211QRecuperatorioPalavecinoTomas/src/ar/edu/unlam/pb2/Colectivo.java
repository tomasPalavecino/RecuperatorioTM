package ar.edu.unlam.pb2;

public class Colectivo extends Vehiculo implements Transporte {
	
	private Integer cantMaxPasajeros;

	public Colectivo(Integer patente, String modelo, Integer cantMaxPasajeros) {
		super(patente, modelo);
		this.cantMaxPasajeros=cantMaxPasajeros;
	}

	public Integer getCantMaxPasajeros() {
		return cantMaxPasajeros;
	}

	public void setCantMaxPasajeros(Integer cantMaxPasajeros) {
		this.cantMaxPasajeros = cantMaxPasajeros;
	}
	
}
