package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Claro", "09941234123", 10);
		
		System.out.println("Telefono: " + telf.getOperadora() +" "+ telf.getNumero() +" "+ telf.getCodigo());
	}

}
