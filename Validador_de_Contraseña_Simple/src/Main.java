import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraCorrecta = "river";
        int intentos = 0;
        int maxIntentos = 3;
        boolean acceso = false;

        while (intentos < maxIntentos) {
            System.out.print("Introduce la contraseña: ");
            String entrada = sc.next(); 

            if (entrada.equals(contraCorrecta)) {
                System.out.println("Acceso concedido");
                acceso = true;
                break;
            } else {
                intentos++;
                if (intentos < maxIntentos) {
                    System.out.println("Incorrecto. Te quedan " + (maxIntentos - intentos) + " intentos.");
                    acceso = false;
                }
            }
        }

        if (acceso == false) {
            System.out.println("Acceso denegado. Contacte a soporte.");
        }
    }
}