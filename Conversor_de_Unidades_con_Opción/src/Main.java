import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor numérico: ");
        double valor = sc.nextDouble();
        
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = valor * 0.621371;
                    System.out.println("el resultado de la convercion es "+ resultado);
                break;
            case 2:
                resultado = (valor * 9.0/5.0) + 32;
                    System.out.println("el resultado de la convercion es "+ resultado);
                break;
            case 3:
                resultado = valor * 3.28084;
                    System.out.println("el resultado de la convercion es "+ resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}