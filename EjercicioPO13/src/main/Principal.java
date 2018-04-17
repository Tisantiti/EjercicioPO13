package main;

import datos.Libres;
import datos.Pisos;
import datos.ProteccionOficial;

public class Principal {

	public static void main(String[] args) {
		
		Pisos p1 = new ProteccionOficial("Fuentes de Andalucía", 140, "casa", 1000, "privada", 5);
		Pisos p2 = new Libres("Cdoskf", 90, "dsfko", 2000, 10);
		System.out.println("Precio por la vivienda libre 1: " + p2.precioVivienda());
		System.out.println("Beneficio por la vivienda libre 1: " + p2.beneficioInmoviliaria());
		System.out.println("Precio por la vivienda oficial 1: " + p1.precioVivienda());
		System.out.println("Beneficio por la vivienda oficial 1: " + p1.beneficioInmoviliaria());

	}

}
