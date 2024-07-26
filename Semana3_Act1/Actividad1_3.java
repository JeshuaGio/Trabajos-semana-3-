import java.util.Scanner;

public class Actividad1_3 {

    public static boolean sabersiespalindromo(String texto) {
        String textoparacomprobar = texto.replaceAll("[^a-z]", ""),textoalrevez = "";
        for (int i = textoparacomprobar.length() - 1; i >= 0; i--) {
            textoalrevez += textoparacomprobar.charAt(i);
        }

        return textoparacomprobar.equals(textoalrevez);
    }

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        String texto;
        System.out.print("Ingresa un texto: ");
        texto = j.nextLine();

        if (sabersiespalindromo(texto)) {
            System.out.println("El texto es palindromo");
        } else {
            System.out.println("El texto no es palindormo");
        }

        j.close();
    }
}
