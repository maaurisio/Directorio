package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono3 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono("movi", "099111111", 1);
        Telefono t2 = new Telefono("claro", "099222222", 2);
        Telefono t3 = new Telefono("movi", "099333333", 3);

        AdminTelefono admin = new AdminTelefono();

        int cantidadMovi = admin.contarMovi(t1, t2, t3);

        System.out.println("Cantidad de teléfonos con operadora 'movi': " + cantidadMovi);
    }
}
