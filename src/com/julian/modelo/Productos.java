package com.julian.modelo;

public abstract class Productos implements Comparable <Productos> {

	
	private String nombre;
	private String unidadDeVenta;
	private double capacidad;
	private double precio;
	
	public Productos() {
		this.nombre=null;
		this.unidadDeVenta=null;
		this.capacidad=0;
		this.precio=0;
	}
	
	public Productos(String n, String u, double c, double p) {
		this.nombre=n;
		this.unidadDeVenta=u;
		this.capacidad=c;
		this.precio=p;
	}

	public String getNombre() {
		return nombre;
	}


	public String getunidadDeVenta() {
		return unidadDeVenta;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Productos o) {
		return this.getPrecio()>o.getPrecio()?1:this.getPrecio()<o.getPrecio()?-1:0;	
	}
	public abstract void mostrarDetalle();
	
	
	
	
}

