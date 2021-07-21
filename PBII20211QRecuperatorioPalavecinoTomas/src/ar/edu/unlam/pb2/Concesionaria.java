package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Concesionaria {
	
	private Set<Vehiculo> vehiculosEnConcesionaria =  new HashSet<>();
	private Set<Vehiculo> vendidos =  new HashSet<>();
	private Set<Vehiculo> servicios =  new HashSet<>();
	private Map<Integer, Venta> ventas =  new HashMap<>();
	private Integer contVentas =0;
	private Integer nroServicios =0;
	
	public Concesionaria() {
	}

	/* Agrega el vehiculo en la concesionaria */
	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculosEnConcesionaria.add(vehiculo);
	}

	/* Devuelve la capacidad de la concesionaria */
	public Set<Vehiculo> getCapacidad() {
		return this.vehiculosEnConcesionaria;
	}

	/* Registra la venta de la empresa */
	public Integer registrarNuevaVenta(Integer dni, String nombre, Integer edad) throws MenorDeEdad {
		Venta ventaActual = new Venta(dni, nombre, edad);
		if(ventaActual.getEdad()>= 18) {
			ventas.put(++contVentas, ventaActual);
			return contVentas;
		}else {
			throw new MenorDeEdad();
		}
	}

	/* El cliente compra el vehiculo */
	public void realizarLaCompra(Integer numeroDeVenta, Integer patente) throws VehiculoInexistente {
		Venta ventaActual = ventas.get(numeroDeVenta);
		if(this.vehiculoExiste(patente)) {
			ventaActual.comprar(this.buscarVehiculo(patente));
			this.vehiculosEnConcesionaria.remove(this.buscarVehiculo(patente));
			this.vendidos.add(this.buscarVehiculo(patente));
		}else {
			 throw new VehiculoInexistente();
		}
	}
	
	/* Busca la existencia del vehiculo en la concesionaria */
	private Boolean vehiculoExiste(Integer patente) throws VehiculoInexistente{
		// Verifica si un producto existe
		for (Vehiculo vehiculo : vehiculosEnConcesionaria) {
			if(vehiculo.getPatente().equals(patente)) {
				return true;
			}
		} throw new VehiculoInexistente();
	}
	
	/* Devuelve el vehiculo */
	private Vehiculo buscarVehiculo(Integer patente) {
		for (Vehiculo vehiculo : vehiculosEnConcesionaria) {
			if(vehiculo.getPatente().equals(patente)) {
				return vehiculo;
			}
		} return null;
	}
	
	/* Devuelve la venta */
	public Venta getVenta(Integer nueroDeVenta) {
		if(this.ventas.containsKey(nueroDeVenta)) {
			return this.ventas.get(nueroDeVenta);
		}
		return null;
	}

	/* Solicita realizar un servicio y si nunca tuvo se le asigna */
	/* Busca si se realizo la venta y si es asi solicita el servicio */
	public void solicitarServicio(Integer patente, Integer nroVenta) throws VehiculoNoVendido, noSeRealizoEstaVenta {
		Venta venta = this.getVenta(nroVenta);
		Vehiculo vehiculo = this.buscarVehiculo(patente);
		if(venta != null) {
			if(this.vendidos.contains(this.buscarVehiculo(patente))) {
				if(vehiculo.getNroServicio() == nroServicios) {
					vehiculo.setNroServicio(nroServicios++);
					this.servicios.add(this.buscarVehiculo(patente));
				}
			}	else {
				throw new VehiculoNoVendido();
			}
		} else {
			throw new noSeRealizoEstaVenta();
		}
		
		
	}

}
