import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una linea de caracteres: ");
        String linea = sc.nextLine();
        char vocalFrecuente = encontrarVocalFrecuente(linea);
        String invertido = invertir(linea);
        String sustituido = sustituirVocales(linea, vocalFrecuente);
        System.out.println("La linea invertida: " + invertido);
        System.out.println("La linea con las vocales sustituidas por " + vocalFrecuente + " es: " + sustituido);
    }
    
    public static char encontrarVocalFrecuente(String linea) {
        int[] contadorVocales = new int[5];
        for (int i = 0; i < linea.length(); i++) {
            char c = Character.toLowerCase(linea.charAt(i));
            switch (c) {
                case 'a':
                    contadorVocales[0]++;
                    break;
                case 'e':
                    contadorVocales[1]++;
                    break;
                case 'i':
                    contadorVocales[2]++;
                    break;
                case 'o':
                    contadorVocales[3]++;
                    break;
                case 'u':
                    contadorVocales[4]++;
                    break;
                default:
                    break;
            }
        }
        int maxContador = 0;
        char vocalFrecuente = ' ';
        for (int i = 0; i < contadorVocales.length; i++) {
            if (contadorVocales[i] > maxContador) {
                maxContador = contadorVocales[i];
                if (i == 0) {
                    vocalFrecuente = 'a';
                } else if (i == 1) {
                    vocalFrecuente = 'e';
                } else if (i == 2) {
                    vocalFrecuente = 'i';
                } else if (i == 3) {
                    vocalFrecuente = 'o';
                } else if (i == 4) {
                    vocalFrecuente = 'u';
                }
            }
        }
        return vocalFrecuente;
    }
    
    public static String invertir(String linea) {
        StringBuilder sb = new StringBuilder(linea);
        sb.reverse();
        return sb.toString();
    }
    
    public static String sustituirVocales(String linea, char vocalFrecuente) {
        StringBuilder sb = new StringBuilder(linea);
        for (int i = 0; i < sb.length(); i++) {
            char c = Character.toLowerCase(sb.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.setCharAt(i, vocalFrecuente);
            }
        }
        return sb.toString();
    }
}

