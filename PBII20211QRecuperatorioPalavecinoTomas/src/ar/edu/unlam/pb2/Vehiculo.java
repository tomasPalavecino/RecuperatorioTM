package ar.edu.unlam.pb2;

public class Vehiculo {
	
	private Integer patente;
	private String modelo;
	private Integer nroServicio;
	
	public Vehiculo(Integer patente, String modelo) {
		this.patente = patente;
		this.modelo = modelo;
	}
	
	public Vehiculo(Integer patente, String modelo, Integer nroServicio) {
		this.patente = patente;
		this.modelo = modelo;
		this.setNroServicio(nroServicio);
	}
	
	public Integer getNroServicio() {
		return nroServicio;
	}

	public void setNroServicio(Integer nroServicio) {
		this.nroServicio = nroServicio;
	}

	public Integer getPatente() {
		return patente;
	}

	public void SetPatente(Integer patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	
}
