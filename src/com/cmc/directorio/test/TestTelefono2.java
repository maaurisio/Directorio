package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi", "098234234", 20);

		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf);

		System.out.println("Operadora: " + telf.getOperadora());
		System.out.println("Número: " + telf.getNumero());
		System.out.println("Código: " + telf.getCodigo());
		System.out.println("Tiene WhatsApp: " + telf.isTieneWhatsapp());
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Telefono telf2 = new Telefono("claro", "098234777", 30);
		
		at.activarMensajeria(telf2);
		System.out.println("Operadora: " + telf2.getOperadora());
		System.out.println("Número: " + telf2.getNumero());
		System.out.println("Código: " + telf2.getCodigo());
		System.out.println("Tiene WhatsApp: " + telf2.isTieneWhatsapp());
		

	}

}
