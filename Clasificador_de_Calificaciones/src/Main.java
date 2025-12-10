import java.util.Scanner;

public class Main {
    
    public static String clasificarCalificacion(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return "Sobresaliente";
        } else if (calificacion >= 80 && calificacion < 90) {
            return "Notable";
        } else if (calificacion >= 70 && calificacion < 80) {
            return "Aprobatorio";
        } else if (calificacion >= 0 && calificacion < 70) {
            return "Reprobatorio";
        } else {
            return "Calificación inválida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu calificación (0-100): ");
        int calificacion = sc.nextInt();
        System.out.println("Tu resultado es: " + clasificarCalificacion(calificacion));
    }
}