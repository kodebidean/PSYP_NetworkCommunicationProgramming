package Ejercicio03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio03_ServidorTCP {
    public static void main(String[] args) {
        ServerSocket server=null;
        Socket socket=null;
        DataInputStream in; // Para recibir datos del cliente
        DataOutputStream out; // Para enviar datos al cliente
        int numconexiones=0;

        try {
            server = new ServerSocket(5000); // Nuevo socket servidor en el puerto 5000
            System.out.println("Servidor iniciado en el puerto 5000");

            // Esperar a que un cliente se conecte
            while(true){
                socket = server.accept(); // Aceptar la conexión
                numconexiones++;
                System.out.println("Conexión establecida con el cliente "+numconexiones);

                // Crear los flujos de entrada y salida
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());

                // Recibir un mensaje del cliente
                String mensaje = in.readUTF();
                System.out.println("Mensaje recibido del cliente "+numconexiones+": "+mensaje);

                // Enviar un mensaje al cliente
                out.writeUTF("Hola cliente "+numconexiones + ", soy el servidor");

                // Cerrar la conexión
                socket.close();
                System.out.println("Conexión cerrada con el cliente "+numconexiones);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
