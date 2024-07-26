import java.util.Scanner;


public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int[] numerosj = new int[6];
        int[] numerosalrevezj = new int[6];
        System.out.println("Ingresa un numero");
        for (int i = 0; i < numerosj.length; i++) {
            System.out.print("Numero " + (i + 1) + ":");
            numerosj[i] = j.nextInt();
        }
                for (int i = 0; i < numerosj.length; i++) {
            numerosalrevezj[i] = numerosj[numerosj.length -1- i];
        }
        System.out.print("Los numeros que ingresaste de forma inverza son :");
        for (int numero : numerosalrevezj) {
            System.out.print(numero+",");
        }
        j.close();
}
}
