package Ejercicio03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Ejercicio03_ClienteTCP {
    public static void main(String[] args) {
        // Declaración de los flujos de entrada y salida
        DataInputStream in; // Para recibir datos del servidor
        DataOutputStream out; // Para enviar datos al servidor

        try{
            Socket socket=new Socket("127.0.0.1",5000); // Conexión del cliente al servidor en el puerto 5000
            // Crear los flujos de entrada y salida
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());
            // Enviar un mensaje al servidor
            out.writeUTF("Hola servidor, soy el cliente");
            // Recibir un mensaje del servidor
            String mensaje=in.readUTF();
            System.out.println("Conexión establecida con el servidor:\n"+ mensaje);
            // Cerrar la conexión
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
