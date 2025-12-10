import java.util.Scanner;

public class Main {
    
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificaciones [] = new double[5];
        
        System.out.println("Introduce 5 calificaciones:");
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }
        
        double promedio = calcularPromedio(calificaciones);
        System.out.println("El promedio de las 5 calificaciones es: "+ promedio);
    }
}