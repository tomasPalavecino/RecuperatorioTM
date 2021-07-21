package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Venta {
	
	private Integer dni;
	private String nombre;
	private Integer edad;
	private List<Vehiculo> compra = new LinkedList<>();
	
	public Venta(Integer dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad=edad;
	}
	
	public void comprar(Vehiculo vehiculo) {
		this.compra.add(vehiculo);
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
