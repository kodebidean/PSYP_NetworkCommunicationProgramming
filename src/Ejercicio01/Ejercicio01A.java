package Ejercicio01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ejercicio01A {
    public static void main(String[] args) {
        try {

            // Método que devuelve un objeto InetAdress conteniendo nombre y dirección IP del host local
            System.out.println("Host: " + InetAddress.getLocalHost()); // Nombre y IP
            System.out.println("Nombre: " + InetAddress.getLocalHost().getHostName()); // Solo el nombre
            System.out.println("IP: " + InetAddress.getLocalHost().getHostAddress()); // Solo la IP

            // Obtener el objeto InetAddress de un host específico
            InetAddress host = InetAddress.getByName("www.ejemplo.com"); // Cambia "www.ejemplo.com" por el host que desees
            System.out.println("Nombre del host específico: " + host.getHostName());
            System.out.println("IP del host específico: " + host.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Error: Host no encontrado.");
        }
    }
}
