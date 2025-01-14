import java.util.Scanner;

public class Principal {
    //consultar mondeda -> consultar pelicula
//converitr moneda-pelicula
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        ConvertirMoneda convertidor = new ConvertirMoneda();
        int opcion = 0;
        while (opcion != 9) {
            limpiarConsola();
            mostrarMenu();
            try {

                opcion = Integer.parseInt(lectura.nextLine());

                switch (opcion) {

                    // Lógica para convertir monedas
                    case 1:
                        System.out.println("\nHas seleccionado 'Convertir Dolar a Sol Peruano'.");
                        convertidor.convertir("USD", "PEN", consulta, lectura);
                        break;

                    case 2:
                        System.out.println("\nHas seleccionado 'Sol Peruano a Dolar '."); // Otra opción
                        convertidor.convertir("PEN", "USD", consulta, lectura);
                        break;

                    case 3:
                        System.out.println("\nHas seleccionado 'Peso Argentino a Dolar '."); // Otra opción
                        convertidor.convertir("ARS", "USD", consulta, lectura);
                        break;

                    case 4:
                        System.out.println("\nHas seleccionado 'Euro a Real Brasileno '."); // Otra opción
                        convertidor.convertir("EUR", "BRL", consulta, lectura);
                        break;

                    case 5:
                        System.out.println("\nHas seleccionado 'Real Brasileno a Euro'."); // Otra opción
                        convertidor.convertir("BRL", "EUR", consulta, lectura);
                        break;

                    case 6:
                        System.out.println("\nHas seleccionado 'Dolar a Peso Boliviano '."); // Otra opción
                        convertidor.convertir("USD", "BOB", consulta, lectura);
                        break;

                    case 7:
                        System.out.println("\nHas seleccionado 'Peso Boliviano a Dolar '."); // Otra opción
                        convertidor.convertir("BOB", "USD", consulta, lectura);
                        break;

                    case 8:
                        mostrarMenu();
                        break;


                    case 9:

                        System.out.println("\n¡Gracias por usar el Conversor de Monedas JDSR! ¡Adiós!");

                        break;

                    default:
                        System.out.println("\nOpción no válida. Por favor, digite nuevamente ¡¡LEA CON ATENCION!!.");
                        break;
                }
                if (opcion != 9) {
                    System.out.print("\nPresiona Enter para continuar...");// Espera a que el usuario presione Enter
                    lectura.nextLine();
                }
            } catch (NumberFormatException e) {

                System.out.println("\nError: Por favor, ingrese un número válido.");

            }
        }
        lectura.close();
    }

    public static void mostrarMenu() {
        System.out.println("********************************************************");
        System.out.println("* *");
        System.out.println("* ░░▒▒▓▓██ Bienvenido al Conversor de Monedas - JDSR ██▓▓▒▒░░ *");
        System.out.println("* *");
        System.out.println("********************************************************");
        System.out.println("* Seleccione la Moneda que desea Convertir:*");
        System.out.println("* 1.Dolar a Sol Peruano *");
        System.out.println("* 2. Sol Peruano a Dolar *");
        System.out.println("* 3.Peso Argentino a Dolar *");
        System.out.println("* 4.Euro a Real Brasileno *");
        System.out.println("* 5.Real Brasileno a Euro *");
        System.out.println("* 6. Dolar a Peso Boliviano *");
        System.out.println("* 7. Peso Boliviano a Dolar *");
        System.out.println("* 8. Realizar otra conversion *");
        System.out.println("* 9. Salir *");
        System.out.println("* *");
        System.out.println("********************************************************");
        System.out.println("* Opción Elegida:  ");

    }

    public static void limpiarConsola() { // Limpia la consola usando ANSI escape codes
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }





}