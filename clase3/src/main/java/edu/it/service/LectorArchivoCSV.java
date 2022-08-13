package edu.it.service;

import java.util.ArrayList;
import java.util.List;

import edu.it.dto.CompraDTO;
import edu.it.entities.Compra;

public class LectorArchivoCSV {
	public List<LectorDeCompra> leerArchivoCSV() {
		ArrayList<LectorDeCompra> lectores = new ArrayList<>();
		
		// la lectura del csv
		lectores.add(() -> new CompraDTO("Beto", "Chevrolet Astra"));
		lectores.add(() -> new CompraDTO("Ana", "WV Gol"));
		lectores.add(() -> new CompraDTO("Ruben", "Fiat Cronos"));
		lectores.add(() -> new CompraDTO("Marcela", "Renault Megane")); 
		
		return lectores;
	}
}
