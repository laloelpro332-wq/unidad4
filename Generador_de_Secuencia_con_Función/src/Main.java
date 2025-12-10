import java.util.Scanner;

public class Main {
    
    public static void generarSecuencia(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();
        
        generarSecuencia(n);
    }
}