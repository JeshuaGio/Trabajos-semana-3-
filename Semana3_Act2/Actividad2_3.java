import java.util.Scanner;


public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int[] numerosj = new int[5];
        int numeromayorj,numeromenorj;
        System.out.println("Ingresa un numero");
        for (int i = 0; i < numerosj.length; i++) {
            System.out.print("Numero " + (i + 1) + ":");
            numerosj[i] = j.nextInt();
        } 
        numeromayorj = numeromenorj = numerosj[0];
        for (int i = 1; i < numerosj.length; i++) {
            if (numerosj[i] > numeromayorj) {
                numeromayorj = numerosj[i];
            }
            if (numerosj[i] < numeromenorj) {
                numeromenorj = numerosj[i];
            }
        }
        System.out.println("El numero mayor que ingresaste es :"+numeromayorj+" El numero menor que ingresaste es :"+numeromenorj);
        j.close();
}
}