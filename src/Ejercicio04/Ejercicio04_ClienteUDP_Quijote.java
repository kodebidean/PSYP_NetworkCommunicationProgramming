package Ejercicio04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ejercicio04_ClienteUDP_Quijote {
    public static void main(String[] args) {
        try (DatagramSocket clientSocket = new DatagramSocket()) { // Usar try-with-resources para cerrar automáticamente el socket
            // Dirección y puerto del servidor
            InetAddress ipServidor = InetAddress.getLocalHost();
            int puertoServidor = 9876;

            // Cadena a enviar
            String cadena = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
            byte[] sendBuffer = cadena.getBytes();

            // Enviar el datagrama al servidor
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, ipServidor, puertoServidor);
            clientSocket.send(sendPacket);
            System.out.println("Mensaje enviado al servidor: " + cadena);

            // Recibir la respuesta del servidor
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            // Mostrar la respuesta del servidor
            String palabraMasLarga = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim();
            System.out.println("Respuesta del servidor: La palabra más larga es \"" + palabraMasLarga + "\"");

        } catch (IOException e) {
            System.err.println("Error en el cliente UDP: " + e.getMessage());
        }
    }
}