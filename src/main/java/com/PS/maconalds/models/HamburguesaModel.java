package com.PS.maconalds.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hamburguesa")
public class HamburguesaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long idHamburguesa;
	
	
	private String nombre;
	private double precio;
	
	
	public long getIdHamburguesa() {
		return idHamburguesa;
	}
	public void setIdHamburguesa(long idHamburguesa) {
		this.idHamburguesa = idHamburguesa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
