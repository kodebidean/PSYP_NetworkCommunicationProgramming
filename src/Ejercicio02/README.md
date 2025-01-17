
# Ejercicio02: Trabajo con URLs

Este ejercicio muestra cómo manipular URLs y extraer sus componentes (protocolo, host, puerto, ruta, etc.) utilizando la clase `URL` de Java.

## Instrucciones

1. **Compilar el Código**:
   ```bash
   javac Ejercicio02B.java
   ```
2. **Ejecutar el Programa**:
   ```bash
   java Ejercicio02B
   ```

## Salida Esperada

El programa mostrará la siguiente información:

```
Protocolo: https
Host: www.ejemplo.com
Puerto: 8080
Path: /ruta/recurso
Archivo: /ruta/recurso
```

### Explicación de la Salida:
- **Protocolo**: El protocolo utilizado en la URL (en este caso, `https`).
- **Host**: El nombre del host (en este caso, `www.ejemplo.com`).
- **Puerto**: El puerto especificado en la URL. Si no se especifica, devuelve `-1`.
- **Path**: La ruta del recurso en la URL (en este caso, `/ruta/recurso`).
- **Archivo**: El archivo o recurso especificado en la URL (en este caso, `/ruta/recurso`).

## Detalles Técnicos

### Clases Utilizadas
- **`URL`**: Clase que representa una URL y proporciona métodos para extraer sus componentes.

### Métodos Clave
- **`getProtocol()`**: Devuelve el protocolo de la URL.
- **`getHost()`**: Devuelve el host de la URL.
- **`getPort()`**: Devuelve el puerto especificado en la URL. Si no se especifica, devuelve `-1`.
- **`getPath()`**: Devuelve la ruta del recurso en la URL.
- **`getFile()`**: Devuelve el archivo o recurso especificado en la URL.

### Manejo de Excepciones
- **`MalformedURLException`**: Se lanza si la URL está mal formada (por ejemplo, si falta el protocolo o el host).

## Ejemplo de Uso

Este ejercicio es útil para:
- Analizar y manipular URLs en aplicaciones web.
- Extraer componentes específicos de una URL (protocolo, host, puerto, etc.).
- Validar la estructura de una URL.

---

¡Esperamos que este ejercicio te sea útil! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.

---