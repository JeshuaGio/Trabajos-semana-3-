import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int[] numerosj = new int[10];
        int contpar = 0,contimpar = 0;
        System.out.println("Ingresa un numero");
        for (int i = 0; i < numerosj.length; i++) {
            System.out.print("Numero " + (i + 1) + ":");
            numerosj[i] = j.nextInt();
        }
        for (int numero : numerosj) {
            if (numero % 2 == 0) {
                contpar++;
            } else {
                contimpar++;
            }
    }
    System.out.println("Los numeros que ingresaste par son :"+contpar+" Los numeros que ingresaste impar son :"+contimpar);    
    j.close();
}
}
