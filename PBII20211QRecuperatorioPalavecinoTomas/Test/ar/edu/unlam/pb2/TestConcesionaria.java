package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcesionaria {

	@Test
	public void queSePuedaCrearUnVehiculoParticular() {
		Urbano auto = new Auto(1, "Fiesta", 4);
		
		assertEquals((Integer)4, auto.getPuertas());
	}
	
	@Test
	public void queSePuedaCrearUnVehiculoTodoTerreno() {
		Todoterreno auto = new Camioneta(1, "4x4", 80);
		
		assertEquals((Integer)80, auto.getCaballosFuerza());
	}
	
	@Test
	public void queSePuedaCrearUnVehiculoTransporte() {
		Transporte auto = new Colectivo(1, "Escolar", 40);
		
		assertEquals((Integer)40, auto.getCantMaxPasajeros());
	}
	
	@Test
	public void queSePuedaCrearUnVehiculoDeportivo() {
		Deportivo auto = new VehiculoDeportivo(1, "Ferrari Superfast", 8500);
		
		assertEquals(8500, auto.getVelocidadMax(), 0.1);
	}
	
	@Test
	public void queSePuedaArmarLaConcesionaria() {
		Concesionaria EstaFamilia = new Concesionaria();
	
		EstaFamilia.agregarVehiculo(new Auto(1, "Fiesta", 4));
		EstaFamilia.agregarVehiculo(new Camioneta(2, "4x4", 80));
		EstaFamilia.agregarVehiculo(new Colectivo(3, "Escolar", 40));
		EstaFamilia.agregarVehiculo(new Colectivo(4, "Publico", 40));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(5, "Ferrari Superfast", 8500));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(6, "Lamborghini Aventador", 9100));
		EstaFamilia.agregarVehiculo(new Camioneta(7, "Ranger", 90));
		EstaFamilia.agregarVehiculo(new Auto(1, "Corsa", 4));
		
		assertEquals(7, EstaFamilia.getCapacidad().size());
	}
	
	@Test
	public void queSePuedaHacerUnaVenta() throws MenorDeEdad {
		
		Concesionaria EstaFamilia = new Concesionaria();
		
		EstaFamilia.agregarVehiculo(new Auto(1, "Fiesta", 4));
		EstaFamilia.agregarVehiculo(new Camioneta(2, "4x4", 80));
		EstaFamilia.agregarVehiculo(new Colectivo(3, "Escolar", 40));
		EstaFamilia.agregarVehiculo(new Colectivo(4, "Publico", 40));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(5, "Ferrari Superfast", 8500));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(6, "Lamborghini Aventador", 9100));
		EstaFamilia.agregarVehiculo(new Camioneta(7, "Ranger", 90));
		EstaFamilia.agregarVehiculo(new Auto(1, "Corsa", 4));
		
		EstaFamilia.registrarNuevaVenta(123456789, "Tomas Palavecino", 18);

	}
	
	@Test (expected = MenorDeEdad.class)
	public void noVenderAMenorDeEdad() throws MenorDeEdad{
Concesionaria EstaFamilia = new Concesionaria();
		
		EstaFamilia.agregarVehiculo(new Auto(1, "Fiesta", 4));
		EstaFamilia.agregarVehiculo(new Camioneta(2, "4x4", 80));
		EstaFamilia.agregarVehiculo(new Colectivo(3, "Escolar", 40));
		EstaFamilia.agregarVehiculo(new Colectivo(4, "Publico", 40));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(5, "Ferrari Superfast", 8500));
		EstaFamilia.agregarVehiculo(new VehiculoDeportivo(6, "Lamborghini Aventador", 9100));
		EstaFamilia.agregarVehiculo(new Camioneta(7, "Ranger", 90));
		EstaFamilia.agregarVehiculo(new Auto(1, "Corsa", 4));
		
		EstaFamilia.registrarNuevaVenta(123456789, "Tomas Palavecino", 17);

	}
	
	@Test
	public void queSePuedaHacerUnService() throws MenorDeEdad, VehiculoNoVendido, noSeRealizoEstaVenta {
		Concesionaria EstaFamilia = new Concesionaria();
		
		EstaFamilia.agregarVehiculo(new Auto(1, "Fiesta", 4));
		
		EstaFamilia.registrarNuevaVenta(123456789, "Tomas Palavecino", 18);
		
		EstaFamilia.solicitarServicio(1, 123456789);
		
	}

}
