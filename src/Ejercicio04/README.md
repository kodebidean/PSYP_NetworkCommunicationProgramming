
# Ejercicio04: Comunicaciones en Red con Sockets UDP

Este ejercicio implementa un servidor y un cliente UDP en Java. El cliente envía una cadena de texto al servidor, y el servidor responde con la palabra más larga de la cadena.

## Instrucciones

1. **Compilar el Código**:
   ```bash
   javac Ejercicio04_ServidorUDP_Quijote.java Ejercicio04_ClienteUDP_Quijote.java
   ```
2. **Ejecutar el Servidor**:
   ```bash
   java Ejercicio04_ServidorUDP_Quijote
   ```
3. **Ejecutar el Cliente**:
   ```bash
   java Ejercicio04_ClienteUDP_Quijote
   ```

## Salida Esperada

### Servidor
```
Servidor UDP iniciado en el puerto 9876. Esperando datagrama...
    Origen: /127.0.0.1:12345
    Mensaje recibido: En un lugar de la Mancha de cuyo nombre no quiero acordarme
    Palabra más larga: acordarme
    Respuesta enviada al cliente.
```

### Cliente
```
Mensaje enviado al servidor: En un lugar de la Mancha de cuyo nombre no quiero acordarme
Respuesta del servidor: La palabra más larga es "acordarme"
```

### Explicación de la Salida:
- **Servidor**:
    - Inicia en el puerto 9876 y espera datagramas.
    - Recibe una cadena de texto del cliente.
    - Encuentra la palabra más larga en la cadena y la envía de vuelta al cliente.
- **Cliente**:
    - Envía una cadena de texto al servidor.
    - Recibe la palabra más larga de la cadena y la muestra por consola.

## Detalles Técnicos

### Clases Utilizadas
- **`DatagramSocket`**: Clase que permite enviar y recibir datagramas UDP.
- **`DatagramPacket`**: Clase que representa un paquete de datos enviado o recibido a través de UDP.
- **`InetAddress`**: Clase que representa una dirección IP.

### Métodos Clave
- **`DatagramSocket.send()`**: Envía un datagrama.
- **`DatagramSocket.receive()`**: Recibe un datagrama.
- **`StringTokenizer`**: Clase utilizada para dividir una cadena en palabras.

### Manejo de Excepciones
- **`IOException`**: Se lanza si ocurre un error de entrada/salida durante la comunicación.

## Ejemplo de Uso

Este ejercicio es útil para:
- Aprender cómo funciona la comunicación cliente-servidor utilizando sockets UDP.
- Practicar el manejo de datagramas y la manipulación de cadenas de texto.
- Entender cómo enviar y recibir mensajes entre un cliente y un servidor en una red.

---

¡Esperamos que este ejercicio te sea útil! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.

---
