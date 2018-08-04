package com.julian.modelo;

public class Alimentos extends Productos {
	public Alimentos(String n, String u, double c, double p) {
		super(n, u, c, p);
	}

		
	
	public void mostrarDetalle() {
		System.out.println("Nombre: "+this.getNombre()+" /// "+"Precio: "+"$"+
	(int)this.getPrecio()+" /// " +"Unidad de venta: "+this.getunidadDeVenta());
	
	
	}	
	
	}
	
