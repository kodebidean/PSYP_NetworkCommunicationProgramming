
# Ejercicio05: Modelo Cliente-Servidor con Objetos Serializados

Este ejercicio implementa un servidor y un cliente TCP en Java que intercambian objetos serializados de tipo `Alumno`. El cliente envía objetos `Alumno` al servidor, y el servidor los recibe y muestra por consola.

## Instrucciones

1. **Compilar el Código**:
   ```bash
   javac Ejercicio05_ServerAlumno.java Ejercicio05_ClienteAlumno.java Alumno.java
   ```
2. **Ejecutar el Servidor**:
   ```bash
   java Ejercicio05_ServerAlumno
   ```
3. **Ejecutar el Cliente**:
   ```bash
   java Ejercicio05_ClienteAlumno
   ```

## Salida Esperada

### Servidor
```
Servidor iniciado en el puerto 1234. Esperando conexiones...
Conexión establecida con el cliente.
Alumno 1 recibido.
Alumno 2 recibido.

Datos de los alumnos recibidos:
Juan    Pérez   Gómez
María   López   Fernández
Conexión con el cliente cerrada.
```

### Cliente
```
Conectado al servidor en localhost:1234
Datos de alumnos enviados al servidor.
```

### Explicación de la Salida:
- **Servidor**:
    - Inicia en el puerto 1234 y espera conexiones.
    - Acepta la conexión de un cliente y recibe objetos `Alumno`.
    - Muestra los datos de los alumnos recibidos y cierra la conexión.
- **Cliente**:
    - Se conecta al servidor en `localhost:1234`.
    - Envía dos objetos `Alumno` al servidor.

## Detalles Técnicos

### Clases Utilizadas
- **`ServerSocket`**: Clase que permite al servidor escuchar conexiones entrantes.
- **`Socket`**: Clase que representa una conexión entre el cliente y el servidor.
- **`ObjectInputStream`**: Flujo de entrada para recibir objetos serializados.
- **`ObjectOutputStream`**: Flujo de salida para enviar objetos serializados.
- **`Alumno`**: Clase que representa un alumno y es serializable.

### Métodos Clave
- **`ServerSocket.accept()`**: Acepta una conexión de un cliente y devuelve un objeto `Socket`.
- **`ObjectInputStream.readObject()`**: Lee un objeto serializado.
- **`ObjectOutputStream.writeObject()`**: Envía un objeto serializado.

### Manejo de Excepciones
- **`IOException`**: Se lanza si ocurre un error de entrada/salida durante la comunicación.
- **`ClassNotFoundException`**: Se lanza si no se encuentra la clase del objeto serializado.

## Ejemplo de Uso

Este ejercicio es útil para:
- Aprender cómo funciona la comunicación cliente-servidor utilizando objetos serializados.
- Practicar la serialización de objetos en Java.
- Entender cómo enviar y recibir datos complejos (como objetos) entre un cliente y un servidor.

---

¡Esperamos que este ejercicio te sea útil! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.

---