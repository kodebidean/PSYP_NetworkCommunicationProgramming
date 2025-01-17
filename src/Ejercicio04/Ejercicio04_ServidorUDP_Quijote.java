package Ejercicio04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class Ejercicio04_ServidorUDP_Quijote {
    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(9876)) { // Usar try-with-resources para cerrar automáticamente el socket
            System.out.println("Servidor UDP iniciado en el puerto 9876. Esperando datagrama...");

            byte[] receiveData = new byte[1024];
            byte[] sendData;

            while (true) {
                // Recibir el datagrama del cliente
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                // Convertir los datos recibidos a una cadena y eliminar espacios en blanco
                String cadena = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim();

                // Obtener la dirección IP y el puerto del cliente
                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                System.out.println("\tOrigen: " + IPAddress + ":" + port);
                System.out.println("\tMensaje recibido: " + cadena);

                // Encontrar la palabra más larga
                String palabraMasLarga = encontrarPalabraMasLarga(cadena);
                System.out.println("\tPalabra más larga: " + palabraMasLarga);

                // Convertir la palabra más larga a bytes
                sendData = palabraMasLarga.getBytes();

                // Enviar la respuesta al cliente
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                serverSocket.send(sendPacket);
                System.out.println("\tRespuesta enviada al cliente.");
            }
        } catch (IOException e) {
            System.err.println("Error en el servidor UDP: " + e.getMessage());
        }
    }

    private static String encontrarPalabraMasLarga(String cadena) {
        StringTokenizer tokenizer = new StringTokenizer(cadena);
        String palabraMasLarga = "";

        while (tokenizer.hasMoreTokens()) {
            String palabra = tokenizer.nextToken();
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        return palabraMasLarga;
    }
}