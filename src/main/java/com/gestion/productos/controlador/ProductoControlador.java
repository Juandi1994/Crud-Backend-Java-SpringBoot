package com.gestion.productos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Importación de la clase List
import com.gestion.productos.servicio.ProductoServicio;
import com.gestion.productos.modelo.Producto; // Importación de las clases Producto y ProductoServicio

@RestController
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
	// Endpoint para listar todos los productos
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return servicio.listarProductos();
	}
	
	// Endpoint para obtener un producto por su ID
	@GetMapping("/productos/{id}")
	public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id) {
		try {
			Producto producto = servicio.obtenerProductoPorId(id);
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}
		catch(Exception exception){
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Endpoint para guardar un nuevo producto
	@PostMapping("/productos")
	public void guardarProducto(@RequestBody Producto producto) {
		servicio.guardarProducto(producto);
	}
	
	// Endpoint para actualizar un producto existente por su ID
	@PutMapping("/productos/{id}")
	public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto, @PathVariable Integer id){
		try {
			Producto productoActual = servicio.obtenerProductoPorId(id);
			productoActual.setNombre(producto.getNombre());
			productoActual.setPrecio(producto.getPrecio());	
			servicio.guardarProducto(productoActual);
			return new ResponseEntity<Producto>(HttpStatus.OK); 
		}
		catch(Exception excepcion) {
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Endpoint para eliminar un producto por su ID
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		servicio.eliminarProducto(id);
	}
}

















