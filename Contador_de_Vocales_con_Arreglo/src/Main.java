public class Main {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        int contador = 0;
        
        for (char letra : letras) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        
        System.out.println("Total de vocales encontradas: " + contador);
    }
}