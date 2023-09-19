package com.gestion.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.productos.modelo.Producto;

/**
 * Interfaz que extiende JpaRepository para el acceso a datos de la entidad Producto.
 *
 * Esta interfaz proporciona métodos predefinidos para realizar operaciones CRUD
 * (Crear, Leer, Actualizar, Eliminar) en la entidad Producto en la base de datos.
 * La entidad Producto se relaciona con esta interfaz por medio de su tipo y el tipo del ID.
 * En este caso, el tipo de la entidad es Producto y el tipo del ID es Integer.
 */
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
	
}
