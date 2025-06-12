package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {

		Telefono telef2 = new Telefono("claro", "098745777", 23);
		Contacto c2 = new Contacto("Mariaa", "Gallardo", telef2, 230.0);

		System.out.println("--- Información del Contacto ---" + "\nNombre: " + c2.getNombre() + "\nApellido: "
				+ c2.getApellido() + "\nPeso: " + c2.getPeso() + " kg" + "\nActivo: " + c2.isActivo()
				+ "\n--- Información del Teléfono ---" + "\n  Operadora: " + c2.getTelefono().getOperadora()
				+ "\n  Numero: " + c2.getTelefono().getNumero() + "\n  Codigo: " + c2.getTelefono().getCodigo()
				+ "\n  Tiene WhatsApp: " + c2.getTelefono().isTieneWhatsapp());

		System.out.println("----------------------------------------------------");

		Telefono telef3 = new Telefono("movi", "098745666", 24);
		Contacto c3 = new Contacto("Soledad", "Heredia", telef3, 700.0);

		System.out.println("--- Información del Contacto ---" + "\nNombre: " + c3.getNombre() + "\nApellido: "
				+ c3.getApellido() + "\nPeso: " + c3.getPeso() + " kg" + "\nActivo: " + c3.isActivo()
				+ "\n--- Información del Teléfono ---" + "\n  Operadora: " + c2.getTelefono().getOperadora()
				+ "\n  Numero: " + c3.getTelefono().getNumero() + "\n  Codigo: " + c3.getTelefono().getCodigo()
				+ "\n  Tiene WhatsApp: " + c3.getTelefono().isTieneWhatsapp());

		Contacto contactoMasPesadoResul;
		AdminContactos adminContactos = new AdminContactos(); // Renombré 'masPesado' a 'adminContactos' para claridad

		// Llama al método y guarda el Contacto retornado
		contactoMasPesadoResul = adminContactos.buscarMasPesado(c2, c3); // Compara Juan (40.0kg) y Marco (70.0kg)

		// Imprime los detalles del CONTACTO más pesado (que es lo que quieres ver)
		if (contactoMasPesadoResul != null) {
			System.out.println("El contacto que mayor peso tiene es:");
			System.out.println("Nombre: " + contactoMasPesadoResul.getNombre());
			System.out.println("Apellido: " + contactoMasPesadoResul.getApellido());
			System.out.println("Peso: " + contactoMasPesadoResul.getPeso() + " kg");
			System.out.println("Activo: " + contactoMasPesadoResul.isActivo());
			System.out.println("--- Detalles del Teléfono ---");
			System.out.println("  Operadora: " + contactoMasPesadoResul.getTelefono().getOperadora());
			System.out.println("  Numero: " + contactoMasPesadoResul.getTelefono().getNumero());
			System.out.println("  Codigo: " + contactoMasPesadoResul.getTelefono().getCodigo());
			System.out.println("  Tiene WhatsApp: " + contactoMasPesadoResul.getTelefono().isTieneWhatsapp());
		} else {
			System.out.println("No se pudo determinar el contacto más pesado.");
		}
		System.out.println("----------------------------------------------------");

		// Correcto: La variable debe ser de tipo boolean
		boolean resultadoComparacionOperadora;

		// Asigna el resultado del método (que es boolean) a la variable boolean
		resultadoComparacionOperadora = adminContactos.compararOperadoras(c2, c3);

		// Imprime el resultado booleano
		System.out.println("¿Las operadoras de " + c2.getNombre() + " y " + c3.getNombre() + " son iguales? "
				+ resultadoComparacionOperadora);

	}

}
