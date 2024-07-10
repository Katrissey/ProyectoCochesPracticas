package com.concensionario.cursospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.concensionario.cursospring.entity.Cliente;
import com.concensionario.cursospring.entity.Coche;
import com.concensionario.cursospring.entity.Venta;
import com.concensionario.cursospring.repository.ClienteRepository;
import com.concensionario.cursospring.repository.CocheRepository;
import com.concensionario.cursospring.service.VentaService;

@SpringBootApplication
public class CursospringApplication implements CommandLineRunner{

	@Autowired
	private VentaService venta;
	@Autowired
	private ClienteRepository clienteService;
	@Autowired
	private CocheRepository cocheService;

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
	}

	public void run(String... args) throws Exception {
 		Coche coche1 = new Coche("Toyota", "Corolla", "Rojo", "123456789", "6593-NRF", "B", 25000.0, true);
		Coche coche2 = new Coche("Honda", "Civic", "Azul", "987654321", "6898-HBF", "C", 23000.0, false);
		Coche coche3 = new Coche("Ford", "Focus", "Blanco", "456789123", "6325-JFF", "ECO", 22000.0, true);
		Coche coche4 = new Coche("Chevrolet", "Cruze", "Negro", "789012345", "6987-FBB", "A", 27000.0, true);
		Coche coche5 = new Coche("Volkswagen", "Golf", "Gris", "234567890", "6985-JFC", "A", 26000.0, false);
		Coche coche6 = new Coche("BMW", "Series 3", "Plata", "901234567", "9815-JDF", "B", 35000.0, true);
		Coche coche7 = new Coche("Audi", "A4", "Azul Oscuro", "345678901", "6578-KIF", "C", 38000.0, false);
		Coche coche8 = new Coche("Mercedes-Benz", "Clase C", "Negro Mate", "678901234", "8215-XCF", "ECO", 40000.0,
				true);
		Coche coche9 = new Coche("Hyundai", "Elantra", "Blanco", "012345678", "6852-JYF", "E", 21000.0, false);
		Coche coche10 = new Coche("Kia", "Optima", "Rojo", "567890123", "6684-DJF", "B", 24000.0, true);

		cocheService.save(coche1);
		cocheService.save(coche2);
		cocheService.save(coche3);
		cocheService.save(coche4);
		cocheService.save(coche5);
		cocheService.save(coche6);
		cocheService.save(coche7);
		cocheService.save(coche8);
		cocheService.save(coche9);
		cocheService.save(coche10);

		Cliente cliente1 = new Cliente("Juan Pérez", "12345678A", 0);
		Cliente cliente2 = new Cliente("María López", "98765432B", 0);
		Cliente cliente3 = new Cliente("Pedro García", "45678901C", 0);
		Cliente cliente4 = new Cliente("Ana Martínez", "23456789D", 0);
		Cliente cliente5 = new Cliente("Luis Sánchez", "89012345E", 0);
		Cliente cliente6 = new Cliente("Elena  Gómez", "67890123F", 0);
		Cliente cliente7 = new Cliente("Miguel Fernández", "34567890G", 0);
		Cliente cliente8 = new Cliente("Laura Díaz", "01234567H", 0);
		Cliente cliente9 = new Cliente("Carlos Rodríguez", "78901234I", 0);
		Cliente cliente10 = new Cliente("Sofía López", "56789012J", 0);

		clienteService.save(cliente1);
		clienteService.save(cliente2);
		clienteService.save(cliente3);
		clienteService.save(cliente4);
		clienteService.save(cliente5);
		clienteService.save(cliente6);
		clienteService.save(cliente7);
		clienteService.save(cliente8);
		clienteService.save(cliente9);
		clienteService.save(cliente10);

		Venta venta1 = new Venta(cliente2, coche6);
		Venta venta2 = new Venta(cliente10, coche8);
		Venta venta3 = new Venta(cliente1, coche5);
		Venta venta4 = new Venta(cliente3, coche7);
		Venta venta5 = new Venta(cliente4, coche9);
		Venta venta6 = new Venta(cliente5, coche1);
		Venta venta7 = new Venta(cliente6, coche3);
		Venta venta8 = new Venta(cliente7, coche2);
		Venta venta9 = new Venta(cliente8, coche4);
		Venta venta10 = new Venta(cliente9, coche10);

		venta.crearVenta(venta1);
		venta.crearVenta(venta2);
		venta.crearVenta(venta3);
		venta.crearVenta(venta4);
		venta.crearVenta(venta5);
		venta.crearVenta(venta6);
		venta.crearVenta(venta7);
		venta.crearVenta(venta8);
		venta.crearVenta(venta9);
		venta.crearVenta(venta10);

	}

}
