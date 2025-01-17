
# Network Communication Programming

---
Repositorio para los ejercicios y proyectos de la asignatura **Programación de Servicios y Procesos** (PSYP), enfocado en la programación de comunicaciones en red.

Este repositorio contiene ejercicios prácticos que cubren temas como:
- Manejo de direcciones IP y nombres de host.
- Trabajo con URLs y sus componentes.
- Comunicaciones en red utilizando sockets TCP y UDP.
- Intercambio de objetos serializados en un modelo cliente-servidor.

## Estructura del Repositorio

El repositorio está organizado en carpetas por ejercicios. Cada ejercicio contiene su propio código y un archivo `README.md` con instrucciones detalladas.

```plaintext
PSYP_NetworkCommunicationProgramming/
│
├── src/
│   ├── Ejercicio01/
│   │   ├── Ejercicio01A/
│   │   ├── Ejercicio01B/
│   │   └── README.md
│   │
│   ├── Ejercicio02/
│   │   ├── Ejercicio02A/
│   │   ├── Ejercicio02B/
│   │   └── README.md
│   │
│   ├── Ejercicio03/
│   │   ├── Ejercicio03A_ServidorTCP/
│   │   ├── Ejercicio03B_ClienteTCP/
│   │   └── README.md
│   │
│   ├── Ejercicio04/
│   │   ├── Ejercicio04_ClienteUDP_Quijote/
│   │   ├── Ejercicio04_ServidorUDP_Quijote/
│   │   └── README.md
│   │
│   ├── Ejercicio05/
│   │   ├── Alumno/
│   │   ├── Ejercicio05_ClienteAlumno/
│   │   ├── Ejercicio05_ServerAlumno/
│   │   └── README.md
│   │
│   ├── .gitignore
│   ├── ProgramacionComunicacionRed.iml
│   └── README.md
│
└── README.md
```

## Cómo Usar este Repositorio

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/kodebidean/PSYP_NetworkCommunicationProgramming.git
   ```
2. **Navega a la carpeta del ejercicio** que te interese:
   ```bash
   cd PSYP_NetworkCommunicationProgramming/src/Ejercicio01
   ```
3. **Sigue las instrucciones** en el `README.md` de cada ejercicio para compilar y ejecutar el código.

## Ejercicios Disponibles

### Ejercicio01: Manejo de Direcciones IP y Nombres de Host
- **Descripción**: Ejercicios para trabajar con direcciones IP y nombres de host utilizando la clase InetAddress.
- **Carpeta**: `src/Ejercicio01/`

### Ejercicio02: Trabajo con URLs
- **Descripción**: Ejercicios para manipular URLs y extraer sus componentes (protocolo, host, puerto, etc.) utilizando la clase URL.
- **Carpeta**: `src/Ejercicio02/`

### Ejercicio03: Implementación de un servidor y un cliente TCP.
- **Descripción**: Implementación de un servidor y un cliente TCP que se comunican mediante sockets. 
- **Carpeta**: `src/Ejercicio03/`

### Ejercicio04: Comunicaciones en Red con Sockets UDP
- **Descripción**: Implementación de un servidor y un cliente UDP que intercambian datagramas.
- **Carpeta**: `src/Ejercicio04/`

### Ejercicio05: Modelo Cliente-Servidor con Objetos Serializados
- **Descripción**: Implementación de un servidor y un cliente que intercambian objetos serializados (en este caso, objetos de tipo Alumno).
- **Carpeta**: `src/Ejercicio05/`

## Contribuciones

Si encuentras algún error, tienes sugerencias o quieres añadir más ejercicios, ¡no dudes en contribuir! Sigue estos pasos:

1. Haz un **fork** del repositorio.
2. Crea una **rama** para tu contribución:
   ```bash
   git checkout -b mi-contribucion
   ```
3. Realiza tus cambios y haz **commit**:
   ```bash
   git commit -m "Añadido nuevo ejercicio sobre X"
   ```
4. Envía un **pull request** para que revisemos tus cambios.

## Licencia

Este repositorio está bajo la licencia [MIT](LICENSE). Siéntete libre de usarlo y modificarlo según tus necesidades.

---

¡Gracias por visitar este repositorio! Esperamos que te sea útil en tu aprendizaje de la programación de servicios y procesos. 😊

---

