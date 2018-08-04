package com.julian.vista;

import com.julian.controlador.ProductoControlador;

public class Test {
	
	
	public static void main(String[] args) {
		ProductoControlador s=new ProductoControlador();
		s.cargarListaDeProductos();
		
		s.mostrarProductos();
		
		s.mayorPrecio();
		s.menorPrecio();

	}
	
}