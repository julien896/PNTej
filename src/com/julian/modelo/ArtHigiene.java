package com.julian.modelo;

public class ArtHigiene extends Productos {
	public ArtHigiene(String n, String t, double c, double p) {
		super(n, t, c, p);
}

	

	public void mostrarDetalle() {	
		System.out.println("Nombre: "+this.getNombre()+" /// "+
	"Contenido: "+(int)this.getCapacidad()+"ml"+" /// " +"Precio: "+"$"+(int)this.getPrecio());

}
	
}

