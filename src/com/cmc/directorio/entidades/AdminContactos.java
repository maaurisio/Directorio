package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
        if (c1 == null && c2 == null) {
            System.out.println("Ambos contactos son nulos. No se puede determinar el más pesado.");
            return null;
        }
        if (c1 == null) {
            System.out.println("El primer contacto es nulo. El más pesado es el segundo.");
            return c2;
        }
        if (c2 == null) {
            System.out.println("El segundo contacto es nulo. El más pesado es el primero.");
            return c1;
        }

        if (c1.getPeso() > c2.getPeso()) {
            return c1;
        } else if (c2.getPeso() > c1.getPeso()) {
            return c2;
        } else {
            // Si tienen el mismo peso, se puede retornar cualquiera, por ejemplo c1
            System.out.println("Ambos contactos tienen el mismo peso.");
            return c1;
        }
    }
	
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
        // Validación básica para evitar NullPointerException si los contactos o sus teléfonos son nulos
        if (c1 == null || c1.getTelefono() == null || c2 == null || c2.getTelefono() == null) {
            System.out.println("Error: No se pueden comparar operadoras si alguno de los contactos o sus teléfonos es nulo.");
            return false;
        }

        // Compara las operadoras usando .equals() para Strings
        return c1.getTelefono().getOperadora().equals(c2.getTelefono().getOperadora());
    }
	
	public void activarUsuario(Contacto c) {
        if (c == null) {
            System.out.println("Error: El contacto es nulo. No se puede activar.");
            return;
        }
        if (c.getTelefono() == null) {
            System.out.println("Error: El contacto " + c.getNombre() + " no tiene un teléfono asociado para verificar WhatsApp.");
            return;
        }

        // Verifica si el teléfono del contacto tiene WhatsApp
        if (c.getTelefono().isTieneWhatsapp()) {
            c.setActivo(true); // Establece 'activo' a true
            System.out.println("Contacto " + c.getNombre() + " activado porque tiene WhatsApp.");
        } else {
            System.out.println("Contacto " + c.getNombre() + " NO activado porque no tiene WhatsApp.");
        }
    }
}
