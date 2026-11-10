AGENCIA DE VIAJES MARTOS S.A. - CALCULADORA DE REPARTO DE GASTOS

Aplicación Java de consola diseñada para repartir equitativamente los costes de un viaje grupal entre hasta 5 participantes. Proyecto desarrollado para el modulo de Programación (Tema 2).

AUTORES Y EQUIPO DE DESARROLLO
- José Manuel Liétor
- Iván Troyano
- Manuel Chiquero

DESCRIPCION DEL PROYECTO
El programa permite registrar los importes abonados de forma independiente por hasta 5 viajeros. Calcula el gasto total del grupo, determina la cuota justa por persona (media = Suma de Gastos / Participantes) y calcula el saldo individual para indicar si cada viajero debe recibir o aportar dinero.

CARACTERISTICAS PRINCIPALES
- Gestión de participantes: Admite hasta 5 viajeros. Si un viajero no asiste o no existe, se registra con un valor negativo (ej. -1) para excluirlo de la media.
- Control de flujo navegable: Menú interactivo por consola con validación de estados (no se puede calcular sin haber introducido datos, ni mostrar resultados sin haber calculado).
- Calculo de Saldos: Distingue si un participante ha abonado de mas, de menos o la cantidad exacta.

REQUISITOS DEL SISTEMA
- Java Development Kit (JDK): Versión 25 o superior recomendada.
- Terminal / Consola de comandos: Bash, Zsh, CMD o PowerShell.

Nota para versiones de Java anteriores a JDK 25:
Si se utiliza una versión con funciones en preview, puede ser necesario compilar y ejecutar añadiendo el parámetro --enable-preview.

COMPILACION Y EJECUCION
Sigue estos pasos desde la terminal dentro de la carpeta raíz del proyecto:

1. Compilación:
javac ProyectoAgenciaViajes.java

2. Ejecución:
java ProyectoAgenciaViajes

INSTRUCCIONES DE USO Y FLUJO DEL MENU
Al iniciar la aplicación, se desplegara el menú principal con 4 opciones:

AGENCIA DE VIAJES MARTOS S.A.
Vamos a calcular el gasto de cada viajero.
Todos pagaran lo mismo.

1. Introducir los gastos de viaje.
2. Calcular reparto de gastos.
3. Mostrar el reparto entre los viajeros.
4. Salir.

Orden Recomendado de Ejecución:
1. Opción 1: Introducir los gastos de viaje
   - Introduce números enteros para el gasto de cada viajero (del 1 al 5).
   - Escribe 0 si un viajero participa pero no realizo pagos.
   - Escribe -1 (o cualquier entero negativo) para indicar que un viajero no participa.

2. Opción 2: Calcular reparto de gastos
   - Procesa los totales y calcula la media del grupo excluyendo a los no participantes.

3. Opción 3: Mostrar el reparto entre los viajeros
   - Muestra el resumen individualizado indicando el dinero a aportar o recibir.

4. Opción 4: Salir
   - Cierra la aplicación.

EJEMPLO PRACTICO DE CASO DE USO
Supongamos 4 participantes y 1 persona que no va al viaje (Viajero 3):

- Viajero 1: Gasto 120 EUR (Participa)
- Viajero 2: Gasto 80 EUR (Participa)
- Viajero 3: Gasto -1 (No participa)
- Viajero 4: Gasto 40 EUR (Participa)
- Viajero 5: Gasto 60 EUR (Participa)

Resultado del Calculo:
- Total acumulado: 120 + 80 + 40 + 60 = 300 EUR
- Participantes activos: 4
- Media por persona: 300 / 4 = 75,00 EUR

Resultados finales:
- Viajero 1: Gasto 120 EUR | Cuota justa: 75,00 EUR | Debe recibir 45,00 EUR
- Viajero 2: Gasto 80 EUR | Cuota justa: 75,00 EUR | Debe recibir 5,00 EUR
- Viajero 3: No participa
- Viajero 4: Gasto 40 EUR | Cuota justa: 75,00 EUR | Debe aportar 35,00 EUR
- Viajero 5: Gasto 60 EUR | Cuota justa: 75,00 EUR | Debe aportar 15,00 EUR

