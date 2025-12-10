import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {1,2,3,4,5,6,7};
        
        System.out.print("Ingresa el número a buscar: ");
        int objetivo = sc.nextInt();
        
        int i = 0;
        boolean encontrado = false;
        
        while (i < arreglo.length) {
            if (arreglo[i] == objetivo) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
                break; 
            }
            i++;
        }
        
        if (encontrado == true) {
            System.out.println("El número no se halló en el arreglo.");
        }
    }
}