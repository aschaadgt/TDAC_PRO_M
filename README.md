TDAC_PRO_M

📌 1. Propósito del Proyecto
   • TDAC_PRO_M es una implementación de una estructura de cola de estudiantes utilizando listas enlazadas en Java.
   • Permite agregar, eliminar, buscar y visualizar estudiantes de manera eficiente, siguiendo el principio FIFO (First In, First Out).
   • Diseñado para demostrar el uso de estructuras de datos dinámicas y evaluar el rendimiento en operaciones de búsqueda.

📂 2. Estructura de Carpetas

   TDAC_PRO_M
   ├── 🏗️ build/                     → Carpeta de compilación (excluir en Git)
   │   ├── 🏗️ classes/               → Clases compiladas (.class)
   │   └── 📦 tdac_pro_m/
   │       ├── ColaEstudiantes.class
   │       ├── Estudiante.class
   │       ├── NodoC.class
   │       └── TDAC_PRO_M.class
   │
   ├── ⚙️ nbproject/                  → Archivos de configuración de NetBeans
   │   ├── build-impl.xml
   │   ├── genfiles.properties
   │   ├── project.properties
   │   ├── project.xml
   │   └── 🔒 private/
   │       └── private.properties
   │
   ├── 📜 src/                         → Código fuente del proyecto
   │   └── 📂 tdac_pro_m/
   │       ├── ColaEstudiantes.java  → Implementación de la cola de estudiantes
   │       ├── Estudiante.java       → Clase que representa un estudiante
   │       ├── NodoC.java            → Nodos de la lista enlazada
   │       └── TDAC_PRO_M.java       → Clase principal con el menú del programa
   │
   └── 🧪 test/                        → Carpeta para pruebas (JUnit u otras)

⚙️ 3. Instrucciones para Compilar y Ejecutar

🖥️ 3.1. En Windows (NetBeans o Consola)
   🏗️ 3.1.1. Usando NetBeans (IDE recomendado)
      - Abrir **NetBeans**.
      - Seleccionar **"File > Open Project"** y elegir la carpeta **TDAC_PRO_M**.
      - Compilar y ejecutar el proyecto desde **"Run > Run Project"**.

   💻 3.1.2. Usando la Línea de Comandos (CMD o PowerShell)
      - Abrir **CMD** y navegar hasta la carpeta `src` del proyecto:
        ```
        cd C:\PROYECTOS\PRGIII\TDAC_PRO_M\src
        ```
      - Compilar las clases:
        ```
        javac tdac_pro_m/*.java
        ```
      - Ejecutar el programa:
        ```
        java tdac_pro_m.TDAC_PRO_M
        ```

🍏 3.2. En macOS o Linux
   💻 3.2.1. Usando Terminal
      - Abrir la **Terminal** y navegar hasta la carpeta `src` del proyecto:
        ```
        cd ~/Proyectos/PRGIII/TDAC_PRO_M/src
        ```
      - Compilar el código:
        ```
        javac tdac_pro_m/*.java
        ```
      - Ejecutar el programa:
        ```
        java tdac_pro_m.TDAC_PRO_M
        ```

🌐 3.3. En Replit (Ejecutar en la nube)
   🚀 3.3.1. Importar el repositorio desde GitHub
      - Ir a [Replit](https://replit.com).
      - Seleccionar **"Importar desde GitHub"**.
      - Ingresar la URL del repositorio.

   ⚙️ 3.3.2. Configurar el archivo `.replit`
      - Crear o editar el archivo `.replit` con el siguiente contenido:
        ```
        run = "javac tdac_pro_m/*.java && java tdac_pro_m.TDAC_PRO_M"
        language = "java"
        ```
   ▶️ 3.3.3. Ejecutar el proyecto
      - Hacer clic en el botón **"Run"**.

📌 Fin del documento.
