package Ejercicio01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ejercicio01B {
    public static void main(String[] args) {
        try {

            InetAddress localHost = InetAddress.getLocalHost();

            // Método que devuelve un objeto InetAdress conteniendo nombre y dirección IP del host local
            System.out.println("Host: " + localHost); // Nombre y IP
            System.out.println("Nombre: " + localHost.getHostName()); // Solo el nombre
            System.out.println("IP: " + localHost.getHostAddress()); // Solo la IP

            // Obtener el objeto InetAddress de un host específico
            InetAddress host = InetAddress.getByName("www.ejemplo.com"); // Cambia "www.ejemplo.com" por el host que desees
            System.out.println("Nombre del host específico: " + host.getHostName());
            System.out.println("IP del host específico: " + host.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Error: Host no encontrado.");
        }
    }
}



