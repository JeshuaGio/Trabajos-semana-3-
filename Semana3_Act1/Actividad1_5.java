import java.util.Scanner;

public class Actividad1_5 {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        String texto,textonuevo;
        char letraparacambiar,nuevalaletra;

        System.out.print("Ingresa un texto ");
        texto = j.nextLine();
        
        System.out.print("Ingresa la letra  que quieres cambiar ");
        letraparacambiar = j.nextLine().charAt(0);
        
        System.out.print("Ingresa la letra que la va a sustitur ");
        nuevalaletra = j.nextLine().charAt(0);
        
        textonuevo = texto.replace(letraparacambiar, nuevalaletra);
        
        System.out.println("El texto como lo modificaste quedo de la siguiente manera: "+textonuevo);
        
        j.close();
    }
}
