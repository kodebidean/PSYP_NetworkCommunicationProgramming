package Ejercicio05;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ejercicio05_ClienteAlumno {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Dirección del servidor
        int port = 1234; // Puerto del servidor

        try (Socket socket = new Socket(serverAddress, port)) { // Usar try-with-resources para cerrar automáticamente el Socket
            System.out.println("Conectado al servidor en " + serverAddress + ":" + port);

            // Crear un flujo de salida para enviar objetos
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());

            // Crear objetos Alumno para enviar al servidor
            Alumno alumno1 = new Alumno("Juan", "Pérez", "Gómez");
            Alumno alumno2 = new Alumno("María", "López", "Fernández");

            // Enviar los objetos Alumno al servidor
            salidaDatos.writeObject(alumno1);
            salidaDatos.writeObject(alumno2);
            System.out.println("Datos de alumnos enviados al servidor.");

        } catch (IOException e) {
            System.err.println("Error en el cliente: " + e.getMessage());
        }
    }
}
