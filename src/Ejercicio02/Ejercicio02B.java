package Ejercicio02;

import java.net.MalformedURLException;
import java.net.URL;

public class Ejercicio02B {
    public static void main(String[] args) {
        try {
            // Crear un objeto URL
            URL direccion = new URL("https://www.ejemplo.com:8080/ruta/recurso");

            // Recuperar protocolo, host y puerto de la URL
            System.out.println("Protocolo: " + direccion.getProtocol());
            System.out.println("Host: " + direccion.getHost());
            System.out.println("Puerto: " + direccion.getPort()); // Devuelve -1 si no se especifica puerto
            System.out.println("Path: " + direccion.getPath()); // Ruta del recurso
            System.out.println("Archivo: " + direccion.getFile()); // Archivo o recurso
        } catch (MalformedURLException e) {
            System.out.println("Error: URL mal formada.");
        }
    }
}
