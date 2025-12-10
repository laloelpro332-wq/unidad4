import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Elige un numero: ");
        int opcion = sc.nextInt();
        
        double area = 0.0;
        
        if (opcion == 1) {
            System.out.print("Introduce el radio: ");
            double radio = sc.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
        } else if (opcion == 2) {
            System.out.print("Introduce la base: ");
            double base = sc.nextDouble();
            System.out.print("Introduce la altura: ");
            double altura = sc.nextDouble();
            area = base * altura;
        }
        System.out.println("El área es: "+ area);
        
        if (area > 100) {
            System.out.println("El área es mayor a 100 unidades cuadradas.");
        } else {
            System.out.println("El área es menor o igual a 100 unidades cuadradas.");
        }
    }
}