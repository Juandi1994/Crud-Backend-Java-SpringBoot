package com.gestion.productos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que representa un producto en el sistema.
 * 
 * Esta clase está anotada con @Entity para indicar que se mapea a una tabla en
 * la base de datos y se puede utilizar con JPA (Java Persistence API).
 */
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private float precio;

	/**
	 * Constructor de la clase con tres parámetros.
	 *
	 * @param id     El ID del producto.
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Producto(Integer id, String nombre, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Constructor de la clase con dos parámetros.
	 *
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Constructor vacío de la clase.
	 */
	public Producto() {
		super();
	}

	/**
	 * Obtiene el ID del producto.
	 *
	 * @return El ID del producto.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Establece el ID del producto.
	 *
	 * @param id El ID del producto.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre del producto.
	 *
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del producto.
	 *
	 * @param nombre El nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el precio del producto.
	 *
	 * @return El precio del producto.
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del producto.
	 *
	 * @param precio El precio del producto.
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}

