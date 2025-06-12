package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
        Telefono t1 = new Telefono("movi", "099111111", 1);
        Telefono t2 = new Telefono("claro", "099222222", 2);
        Telefono t3 = new Telefono("movi", "099333333", 3);
        Telefono t4 = new Telefono("claro", "099337777", 4);

        AdminTelefono admin = new AdminTelefono();

        int cantidadClaro = admin.contarClaro(t1, t2, t3, t4);

        System.out.println("Cantidad de teléfonos con operadora 'claro': " + cantidadClaro);

	}

}
