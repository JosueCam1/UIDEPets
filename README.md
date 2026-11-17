# UIDE PETS

Aplicación de escritorio para una tienda de productos para mascotas. El proyecto está desarrollado con Java Swing, formularios de NetBeans y Maven, y utiliza SQL Server para cuentas de usuario y carrito de compras.

## Funciones

- Navegación por productos para perros, gatos y conejos.
- Secciones de comida, accesorios, higiene, hábitat y juguetes.
- Registro e inicio de sesión de usuarios.
- Carrito persistido en SQL Server: agregar productos, cambiar cantidades y eliminarlos.
- Pantalla de pago que marca el carrito como pagado. La aplicación no procesa pagos reales ni se conecta a una pasarela de pago.

## Tecnologías

- Java 24, indicado por la configuración de Maven.
- Java Swing y formularios visuales de NetBeans (.form).
- Maven Wrapper, para compilar con mvnw.
- Microsoft SQL Server y el controlador JDBC mssql-jdbc 12.4.2.
- FlatLaf 3.6 para el aspecto visual.

## Estructura del proyecto

- src/main/java/com/mycompany/uidepets: ventanas principales, registro, inicio de sesión, sesión y conexión a SQL Server.
- src/main/java/com/mycompany/views: pantallas de categorías, carrito y pago.
- src/main/resources: imágenes e iconos usados por la interfaz.
- database/01_create_schema.sql: creación de la base Info y las tablas Usuario, PRODUCTOS, CARRO y DETALLE_CARRO.
- pom.xml: versión de Java, plugins y dependencias Maven.
- mvnw y mvnw.cmd: wrapper de Maven para macOS/Linux y Windows.

## Requisitos

1. JDK 24.
2. NetBeans con soporte para proyectos Maven, o Maven Wrapper.
3. SQL Server configurado para aceptar conexiones con autenticación SQL.
4. SQL Server Management Studio u otra herramienta para ejecutar el script de base de datos.

## Preparar la base de datos

1. Abre database/01_create_schema.sql en SQL Server Management Studio y ejecútalo. El script crea la base Info y las cuatro tablas requeridas por el código.
2. La tabla PRODUCTOS queda vacía porque el proyecto no incluye un catálogo confiable con nombres y precios. Inserta los productos reales usando los IDs que esperan los botones de la interfaz antes de probar el carrito.
3. Ejecuta la aplicación con un usuario SQL que tenga permisos sobre Info.

La pantalla de pago solo cambia el estado del carrito a PAGADO. No se definió una tabla de pagos porque el código no registra transacciones.

## Configurar la conexión

La clase Conexion obtiene los parámetros desde variables de entorno:

- UIDE_DB_SERVER: servidor o servidor\instancia. Valor por defecto: localhost\BDDUIDEPETS.
- UIDE_DB_NAME: base de datos. Valor por defecto: Info.
- UIDE_DB_USER: usuario SQL. Valor por defecto: sa.
- UIDE_DB_PASSWORD: contraseña SQL. Obligatoria.

Ejemplo para PowerShell; reemplaza el valor de ejemplo y no lo guardes en el repositorio:

    $env:UIDE_DB_SERVER = 'localhost\BDDUIDEPETS'
    $env:UIDE_DB_NAME = 'Info'
    $env:UIDE_DB_USER = 'sa'
    $env:UIDE_DB_PASSWORD = 'tu-clave-local'

Abre NetBeans desde esa misma sesión para que herede las variables, o configura las variables de entorno de Windows y reinicia NetBeans. La conexión usa cifrado y confía en el certificado del servidor, adecuado para desarrollo local.

## Abrir y ejecutar en NetBeans

1. Clona el repositorio o descarga el proyecto.
2. En NetBeans, selecciona File > Open Project y elige la carpeta que contiene pom.xml.
3. Configura la clase principal como com.mycompany.uidepets.Panel si NetBeans lo solicita.
4. Configura las variables de conexión, asegúrate de que SQL Server esté activo y selecciona Run Project.

Para compilar desde PowerShell en Windows, abre la raíz del proyecto y ejecuta:

    .\mvnw.cmd clean package

La primera compilación puede necesitar acceso a Internet para descargar las dependencias de Maven.

## Limitaciones conocidas

- Las contraseñas se guardan y comparan como texto normal en el código actual. No uses contraseñas sensibles; conviene migrar la autenticación a hashes seguros.
- Sin registros en PRODUCTOS, las acciones de agregar al carrito no encontrarán los productos.
- Algunos IDs de producto aparecen repetidos en pantallas distintas; confirma el catálogo y sus precios antes de cargar los datos.
- El esquema SQL reconstruye la estructura necesaria, pero no recupera los registros de la base de datos perdida.
