🌎💱 Conversor de Divisas - JDSR
¡Bienvenido al Conversor de Divisas JDSR! Este proyecto es una aplicación sencilla en Java que permite convertir diversas divisas utilizando tasas de cambio actualizadas a través de la API ExchangeRate.

🚀 Características
Conversión entre múltiples monedas, incluyendo USD, PEN, ARS, EUR, BRL, y más.

Interface de usuario amigable en la consola.

Manejo de excepciones para entradas no válidas.

Tasa de cambio actualizada mediante la API de ExchangeRate-API.

Formateo de números para mostrar solo tres dígitos después del punto decimal.

🛠️ Requisitos
Java 11 o superior.

Conexión a Internet para acceder a la API de ExchangeRate-API.

Biblioteca GSON para manejo de JSON.

📦 Instalación
Clona el repositorio:

bash
git clone https://github.com/tuusuario/conversor-monedas-jdsr.git
Compila el proyecto:

bash
cd conversor-monedas-jdsr
javac -cp gson-2.8.6.jar:. Principal.java ConvertirMoneda.java ConsultarMoneda.java
Ejecuta la aplicación:

bash
java -cp gson-2.8.6.jar:. Principal
🌟 Uso
Ejecuta la aplicación.

Selecciona la opción de conversión que deseas realizar en el menú.

Introduce la cantidad de dinero que deseas convertir.

Recibe el resultado de la conversión y continúa usando el menú o sal de la aplicación.

🔧 Estructura del Proyecto
Principal.java: Clase principal que muestra el menú y maneja la interacción del usuario.

ConvertirMoneda.java: Clase que contiene la lógica de conversión de monedas.

ConsultarMoneda.java: Clase que consulta la tasa de cambio actual de la API.

Monedita.java: Registro que representa los datos de la moneda obtenidos de la API.

📝 Ejemplo de Uso
bash
********************************************************
*                                                      *
*    ░░▒▒▓▓██ Bienvenido al Conversor de Monedas - JDSR ██▓▓▒▒░░    *
*                                                      *
********************************************************
* Seleccione la moneda que desea Convertir:            *
* 1. Dolar a Sol Peruano                               *
* 2. Sol Peruano a Dolar                               *
* 3. Peso Argentino a Dolar                            *
* 4. Euro a Real Brasileno                             *
* 5. Real Brasileno a Euro                             *
* 6. Dolar a Peso Boliviano                            *
* 7. Peso Boliviano a Dolar                            *
* 8. Realizar otra conversión                          *
* 9. Salir                                             *
********************************************************
🤝 Comentarios
¡Todo comentario es bienvenido! con el fin de mejorar este proyecto, gracias.
