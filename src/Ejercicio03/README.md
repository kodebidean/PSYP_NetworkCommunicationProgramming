
# Ejercicio03: Comunicaciones en Red con Sockets TCP

Este ejercicio implementa un servidor y un cliente TCP en Java. El cliente envía un mensaje al servidor, y el servidor responde con un mensaje de confirmación.

## Instrucciones

1. **Compilar el Código**:
   ```bash
   javac Ejercicio03_ServidorTCP.java Ejercicio03_ClienteTCP.java
   ```
2. **Ejecutar el Servidor**:
   ```bash
   java Ejercicio03_ServidorTCP
   ```
3. **Ejecutar el Cliente**:
   ```bash
   java Ejercicio03_ClienteTCP
   ```

## Salida Esperada

### Servidor
```
Servidor iniciado en el puerto 5000
Conexión establecida con el cliente 1
Mensaje recibido del cliente 1: Hola servidor, soy el cliente
Conexión cerrada con el cliente 1
```

### Cliente
```
Conexión establecida con el servidor:
Hola cliente 1, soy el servidor
```

### Explicación de la Salida:
- **Servidor**:
    - Inicia en el puerto 5000 y espera conexiones.
    - Acepta la conexión de un cliente y recibe un mensaje.
    - Envía una respuesta al cliente y cierra la conexión.
- **Cliente**:
    - Se conecta al servidor en `localhost:5000`.
    - Envía un mensaje al servidor y recibe una respuesta.

## Detalles Técnicos

### Clases Utilizadas
- **`ServerSocket`**: Clase que permite al servidor escuchar conexiones entrantes.
- **`Socket`**: Clase que representa una conexión entre el cliente y el servidor.
- **`DataInputStream`**: Flujo de entrada para recibir datos.
- **`DataOutputStream`**: Flujo de salida para enviar datos.

### Métodos Clave
- **`ServerSocket.accept()`**: Acepta una conexión de un cliente y devuelve un objeto `Socket`.
- **`Socket.getInputStream()`**: Obtiene el flujo de entrada para recibir datos.
- **`Socket.getOutputStream()`**: Obtiene el flujo de salida para enviar datos.
- **`DataInputStream.readUTF()`**: Lee un mensaje en formato UTF.
- **`DataOutputStream.writeUTF()`**: Envía un mensaje en formato UTF.

### Manejo de Excepciones
- **`IOException`**: Se lanza si ocurre un error de entrada/salida durante la comunicación.

## Ejemplo de Uso

Este ejercicio es útil para:
- Aprender cómo funciona la comunicación cliente-servidor utilizando sockets TCP.
- Entender cómo enviar y recibir mensajes entre un cliente y un servidor.
- Practicar la implementación de aplicaciones de red en Java.

---

¡Esperamos que este ejercicio te sea útil! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.

---
