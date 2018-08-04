package com.julian.controlador;

import java.util.LinkedList;
import java.util.List;

import com.julian.modelo.Alimentos;
import com.julian.modelo.ArtHigiene;
import com.julian.modelo.Bebidas;
import com.julian.modelo.Productos;

public class ProductoControlador {
	private List<Productos> listaDeProductos;
	public ProductoControlador() {
		this.listaDeProductos=new LinkedList<>();
	}
	public void agregarProducto(Productos p){
		this.listaDeProductos.add(p);
	}
	
	
	public void cargarListaDeProductos() {
		Productos p1=new Bebidas("Coca Cola Zero", "Litros", 1.5, 20);
		Productos p2=new Bebidas("Coca Cola", "Litros", 1.5, 18);
		Productos p3=new ArtHigiene("Shampoo Sedal", "Contenido", 500, 19);
		Productos p4=new Alimentos("Frutillas", "Kilo", 1, 64);
		
		this.agregarProducto(p1);
		this.agregarProducto(p2);
		this.agregarProducto(p3);
		this.agregarProducto(p4);
	}
	public void mostrarProductos() {
		for ( Productos producto : listaDeProductos) {
			producto.mostrarDetalle();
		}
		System.out.println("=======================");
	}
	public void mayorPrecio() {
		Productos max;
		max=this.listaDeProductos.get(0);
		for (Productos producto : listaDeProductos) {
			
			if (producto.compareTo(max)>0) {
				max=producto;
			}
		}
		
		System.out.println("Producto mas caro: "+max.getNombre()); 
	}
	public void menorPrecio() {
		Productos min;
		min=this.listaDeProductos.get(0);
		for (Productos producto : listaDeProductos) {
			
			if (producto.compareTo(min)<0) {
				min=producto;
			}
		}
		System.out.println("Producto mas barato: "+min.getNombre());

	}
}


