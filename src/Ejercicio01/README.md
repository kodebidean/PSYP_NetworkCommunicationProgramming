
# Ejercicio01: Manejo de Direcciones IP y Nombres de Host

Este ejercicio muestra cómo trabajar con direcciones IP y nombres de host utilizando la clase `InetAddress` de Java. El programa obtiene y muestra información sobre el host local y un host específico.

## Instrucciones

1. **Compilar el Código**:
   ```bash
   javac Ejercicio01B.java
   ```
2. **Ejecutar el Programa**:
   ```bash
   java Ejercicio01B
   ```

## Salida Esperada

El programa mostrará la siguiente información:

```
Host: nombre-del-equipo/192.168.1.1
Nombre: nombre-del-equipo
IP: 192.168.1.1
Nombre del host específico: www.ejemplo.com
IP del host específico: 93.184.216.34
```

### Explicación de la Salida:
- **Host**: Nombre y dirección IP del host local.
- **Nombre**: Solo el nombre del host local.
- **IP**: Solo la dirección IP del host local.
- **Nombre del host específico**: Nombre del host especificado (en este caso, `www.ejemplo.com`).
- **IP del host específico**: Dirección IP del host especificado.

## Detalles Técnicos

### Clases Utilizadas
- **`InetAddress`**: Clase que representa una dirección IP (IPv4 o IPv6) y proporciona métodos para obtener información sobre hosts.

### Métodos Clave
- **`getLocalHost()`**: Devuelve un objeto `InetAddress` que representa el host local.
- **`getHostName()`**: Devuelve el nombre del host.
- **`getHostAddress()`**: Devuelve la dirección IP del host.
- **`getByName(String host)`**: Devuelve un objeto `InetAddress` para un host específico.

### Manejo de Excepciones
- **`UnknownHostException`**: Se lanza si no se puede resolver el nombre del host.

## Ejemplo de Uso

Este ejercicio es útil para:
- Obtener información sobre la configuración de red del host local.
- Resolver nombres de host y obtener sus direcciones IP.
- Verificar la conectividad de red.

---

¡Esperamos que este ejercicio te sea útil! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.

---
