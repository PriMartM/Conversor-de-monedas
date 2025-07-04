import java.io.IOException;
import java.util.Scanner;

public class Conversordemonedas {
    public static void main(String[] args) {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        String optionText = "Ingresa el valor que desear convertir:";
        double convertedValue;
        double valueToConvert;
        String textMenu = """
                **********************************************
                Sea bienvenido/a al Conversor de Moneda 
                
                1) Dólar -> Peso argentino
                2) Peso argentino -> Dólar
                3) Dólar -> Real brasileño
                4) Real brasileño -> Dólar
                5) Dólar -> Peso colombiano
                6) Peso colombiano -> Dólar
                7) Salir
                Elija una opción válida:
                **********************************************
                """;

        while(option != 7){
            System.out.println(textMenu);
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("USD", "ARS", valueToConvert);
                        Monedas result = service.getCoin();
                    System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + result + " [ARS]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("ARS", "USD", valueToConvert);
                        Monedas result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [ARS] corresponde al valor final de =>>> " + result + " [USD]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("USD", "BRL", valueToConvert);
                        Monedas result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + result + " [BRL]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("BRL", "USD", valueToConvert);
                        Monedas result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [BRL] corresponde al valor final de =>>> " + result + " [USD]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 5:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("USD", "COP", valueToConvert);
                        Monedas result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + result + " [COP]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 6:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        API service = new API("COP", "USD", valueToConvert);
                        Monedas result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [COP] corresponde al valor final de =>>> " + result + " [USD]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

    }
}
