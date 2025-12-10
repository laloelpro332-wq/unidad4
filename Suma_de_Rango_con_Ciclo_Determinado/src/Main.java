import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el inicio del rango : ");
        int a = sc.nextInt();
        System.out.print("Introduce el fin del rango : ");
        int b = sc.nextInt();
        if (a>=0) {
            int suma = 0;
            
            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    suma += i;
                }
                System.out.println("La suma es: " + suma);
            } else {
                System.out.println("A debe ser menor o igual que B.");
            }
        }else{
            System.out.println("los numero deben ser positivos");
        }
    }
    }