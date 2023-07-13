import javax.swing.*;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){

        System.out.println("**** Aplicación Calculadora ****");

        //Mostrar el menú
            mostrarMenu();
        try {
            var operacion = Integer.parseInt(consola.nextLine().trim());
            //Revisar que este dentro de las opciones

            if (operacion >= 1 && operacion <= 4) {
                //Ejecutamos la operación deseada
                ejecutarOperacion(operacion,consola);
            } else if (operacion == 5) {
                System.out.println("Hasta pronto...");
                break;
            } else {
                System.out.println("Opción Erronea -> " + operacion);
            }
            // Imprimimos un salto de linea
            System.out.println();
        }// fin de try
        catch(Exception e) {
            System.out.println("Ocurrio un error: "+ e.getMessage());
        }

        }// fin while

    }// fin de main
    private static void mostrarMenu(){
        System.out.println("1.Suma \n2. Resta \n3. Multiplicar \n4. Dividir \n5. Salir");
        System.out.print("Operaciones a realizar");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine().trim());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine().trim());
        double resultado = 0;
        var tipoOperacion = "";
        switch (operacion) { // Suma
            case 1 -> {
                tipoOperacion = "Suma";
                resultado = operando1 + operando2;
            }
            case 2 -> { // Resta
                tipoOperacion = "Resta";
                resultado = operando1 - operando2;
            }
            case 3 -> { // Multiplicación
                tipoOperacion = "Multiplicación";
                resultado = operando1 * operando2;
            }
            case 4 -> {// División
                tipoOperacion = "Division";
                resultado = operando1 / operando2;
            }
            default -> System.out.println("opcion erronea: " + operacion);
        }
        System.out.println("Resultado de " + tipoOperacion + " = " + resultado);
    }
} // fin de class
