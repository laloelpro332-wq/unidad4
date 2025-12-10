public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2,3,4,5};
        
        System.out.println("Arreglo invertido:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}