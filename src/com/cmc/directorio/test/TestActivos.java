package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		
		boolean activarContacto;
		
		Telefono telf1 = new Telefono("movi", "0981318987", 44);
		Contacto cont1 = new Contacto("Daniel", "Mora", telf1 , 123.01 );
		
		System.out.println("------Datos del Telefono----");
		System.out.println("Operadora: " + cont1.getTelefono().getOperadora());
		System.out.println("Numero: " + cont1.getTelefono().getNumero());
		System.out.println("Codigo: " + cont1.getTelefono().getCodigo());
		System.out.println("Tiene Whatsaap?: " + cont1.getTelefono().isTieneWhatsapp());
		
		System.out.println("\n------Información del Contacto----");
		System.out.println("Nombre: " + cont1.getNombre());
		System.out.println("Apellido: " + cont1.getApellido());
		System.out.println("Peso: " + cont1.getPeso());
		System.out.println("Activo: " + cont1.isActivo());
		
		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf1);
		
		AdminContactos admin = new AdminContactos();
		
		admin.activarUsuario(cont1);
		
		System.out.println("Resultado de la activación: El contacto " + cont1.getNombre() + " " + cont1.getApellido() + " está " + (cont1.isActivo() ? "activado." : "desactivado."));
	}

}
