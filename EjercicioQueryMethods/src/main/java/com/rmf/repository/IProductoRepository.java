package com.rmf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rmf.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{
	
	@Query("SELECT p FROM com.rmf.entity.Producto p") 
	public List<Producto> getAllProductos();
	
	@Query("SELECT p FROM com.rmf.entity.Producto p WHERE p.vendedor=:vendedor")
	public List<Producto> getProductosVendedor(String vendedor);
	
	@Query("SELECT p FROM com.rmf.entity.Producto p ORDER by p.precio asc")
	public List<Producto> getDatosOrdenados();

	@Query("SELECT p FROM com.rmf.entity.Producto p WHERE p.activo=true")
	public List<Producto> getAllProductosActivos(boolean activo);
	
	@Query("SELECT p FROM com.rmf.entity.Producto p WHERE p.precio BETWEEN 10 AND 67")
	public List<Producto> getPrecioRango(Integer precioMenor, Integer precioMayor);

	@Query("SELECT p FROM com.rmf.entity.Producto p WHERE p.id =?1 OR p.precio <?2")
	public List<Producto> getDatosPosicionales(Integer id, Integer precio);


}


