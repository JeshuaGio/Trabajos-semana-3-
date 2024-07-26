import java.util.Scanner;

public class Actividad1_6 {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        double numeroj,raiz;
        System.out.print("Ingresa un numero ");
        numeroj = j.nextDouble();

        raiz = Math.sqrt(numeroj);
        System.out.println("La raiz cuadrada de "+numeroj+" es: " + raiz);
        

        j.close();
    }
}
