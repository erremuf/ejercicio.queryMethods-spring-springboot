package com.rmf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rmf.entity.Producto;
import com.rmf.repository.IProductoRepository;

@SpringBootApplication
public class EjercicioQueryMethodsApplication implements CommandLineRunner{
	
	@Autowired
	IProductoRepository productRepo;
	
	private void cargaDeDatos() {
		productRepo.save(new Producto(1, "028733S", "Amazon", 50, true));
		productRepo.save(new Producto(2, "837291P", "MediaMarkt", 199, true));
		productRepo.save(new Producto(3, "758392K", "MediaMarkt", 210, false));
		productRepo.save(new Producto(4, "928344H", "Lidl", 19, true));
		productRepo.save(new Producto(5, "736272H", "Amazon", 47, false));
		productRepo.save(new Producto(6, "747783S", "Leroy Merlyn", 30, false));
		productRepo.save(new Producto(7, "738294R", "Amazon", 65, true));
		productRepo.save(new Producto(8, "778493U", "Lidl", 10, false));
		productRepo.save(new Producto(9, "546207F", "Amazon", 28, true));
		productRepo.save(new Producto(10, "809754V", "Leroy Merlyn", 25, true));
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioQueryMethodsApplication.class, args);
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	
	// CARGAR DATOS -- 
		
		cargaDeDatos();
	
	
	// PROBANDO MÉTODOS --
		
		List<Producto> lista = new ArrayList<Producto>();
		
		//lista = productRepo.getAllProductos();
		//lista = productRepo.getAllProductosActivos(true);
		//lista = productRepo.getProductosVendedor("Amazon");
		//lista = productRepo.getDatosOrdenados();
		//lista = productRepo.getPrecioRango(null, null);
		//lista = productRepo.getDatosPosicionales(2, 20);
		
		System.out.println(lista);
		
		
		
		
		
		
		//System.out.println(productRepo.getAllProductos());
		
		//System.out.println(productRepo.getProductosVendedor("Amazon").toString());
		
		//System.out.println(productRepo.getDatosOrdenados().toString());
		
		//System.out.println(productRepo.getAllProductosActivos(true).toString());
		
		//System.out.println(productRepo.getPrecioRango(10, 50).toString());
		
		//System.out.println(productRepo.getDatosPosicionales(null, null).toString());
	
	}
	
	
	
}
