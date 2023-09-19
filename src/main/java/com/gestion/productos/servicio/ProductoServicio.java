package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.modelo.Producto;
import com.gestion.productos.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
	
	@Autowired
	private ProductoRepositorio repositorio;
	
	/**
	 * Obtiene una lista de todos los productos.
	 *
	 * @return Lista de productos.
	 */
	public List<Producto> listarProductos(){
		return repositorio.findAll();
	}
	
	/**
	 * Guarda un nuevo producto en la base de datos.
	 *
	 * @param producto El producto que se va a guardar.
	 */
	public void guardarProducto(Producto producto) {
		repositorio.save(producto);
	}
	
	/**
	 * Obtiene un producto por su ID.
	 *
	 * @param id El ID del producto que se busca.
	 * @return El producto encontrado, o null si no se encuentra.
	 */
	public Producto obtenerProductoPorId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}
	
	/**
	 * Elimina un producto por su ID.
	 *
	 * @param id El ID del producto que se va a eliminar.
	 */
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);
	}
}

