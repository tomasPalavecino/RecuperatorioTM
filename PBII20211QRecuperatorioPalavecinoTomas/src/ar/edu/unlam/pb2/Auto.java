package ar.edu.unlam.pb2;

public class Auto extends Vehiculo implements Urbano {
	
	private Integer puertas;

	public Auto(Integer patente, String modelo, Integer puertas) {
		super(patente, modelo);
		this.puertas=puertas;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	
}
