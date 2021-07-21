package ar.edu.unlam.pb2;

public class VehiculoDeportivo extends Vehiculo implements Deportivo {
	
	private Integer velocidad;

	public VehiculoDeportivo(Integer patente, String modelo, Integer velocidad) {
		super(patente, modelo);
		this.velocidad=velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getVelocidadMax() {
		return this.velocidad;
	}
	
}
