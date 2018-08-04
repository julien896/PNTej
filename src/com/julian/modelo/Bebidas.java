package com.julian.modelo;

public class Bebidas extends Productos {

	public Bebidas(String n, String u,double c, double p) {
		super(n, u, c, p);

		
		
	}	
	
	public void mostrarDetalle() {
		System.out.println("Nombre: "+this.getNombre()+" /// "+this.getunidadDeVenta()+": "
				+ ""+this.getCapacidad()+" /// " +"Precio: "+"$"+(int)this.getPrecio());

	}
	
}
