package Ejercicio05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio05_ServerAlumno {
    public static void main(String[] args) {
        int port = 1234; // Puerto en el que el servidor escuchará

        try (ServerSocket server = new ServerSocket(port)) { // Usar try-with-resources para cerrar automáticamente el ServerSocket
            System.out.println("Servidor iniciado en el puerto " + port + ". Esperando conexiones...");

            // Aceptar la conexión de un cliente
            Socket connectionCliente = server.accept();
            System.out.println("Conexión establecida con el cliente.");

            // Crear un flujo de entrada para recibir objetos
            ObjectInputStream entradaDatos = new ObjectInputStream(connectionCliente.getInputStream());

            // Crear un array para almacenar los objetos Alumno recibidos
            Alumno[] arrayAlumnos = new Alumno[2];

            // Recibir los objetos Alumno del cliente
            for (int i = 0; i < arrayAlumnos.length; i++) {
                Alumno dataAlumno = (Alumno) entradaDatos.readObject(); // Leer un objeto Alumno
                arrayAlumnos[i] = dataAlumno; // Almacenar el objeto en el array
                System.out.println("Alumno " + (i + 1) + " recibido.");
            }

            // Mostrar los datos de los alumnos recibidos
            System.out.println("\nDatos de los alumnos recibidos:");
            for (Alumno dataAlumno : arrayAlumnos) {
                System.out.println(dataAlumno.getNombre() + "\t" + dataAlumno.getApellido1() + "\t" + dataAlumno.getApellido2());
            }

            // Cerrar la conexión con el cliente
            connectionCliente.close();
            System.out.println("Conexión con el cliente cerrada.");

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error en el servidor: " + e.getMessage());
        }
    }
}
