package ar.edu.unlam.pb2;

public class Camioneta extends Vehiculo implements Todoterreno {
	
	private Integer caballosFuerza;

	public Camioneta(Integer patente, String modelo, Integer caballosFuerza) {
		super(patente, modelo);
		this.caballosFuerza=caballosFuerza;
	}
	
	public Integer getCaballosFuerza() {
		return caballosFuerza;
	}

	public void setCaballosFuerza(Integer caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

}
