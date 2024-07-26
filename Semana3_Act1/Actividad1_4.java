import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        String texto,textoenmayusculas,textobien = "";
        
        System.out.println("Ingresa el texto ");

        while (true) {
            texto = j.nextLine();
            
            if (texto.equals(" ")) {
                break;
            }
            
            textoenmayusculas = texto.toUpperCase();
            
            if (textobien.length() > 0) {
                textobien += " ";
            }
            textobien += textoenmayusculas;
        }
        
        System.out.println("El texto en mayusculas queda de la siguiente manera :"+textobien);
        
        j.close();
    }
}
