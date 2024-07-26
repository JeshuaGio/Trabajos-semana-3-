import java.util.Scanner;


public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int[] numerosj = new int[5];
        int sumaj = 0;
        System.out.println("Ingresa un numero");
        for (int i = 0; i < numerosj.length; i++) {
            System.out.print("Numero" + (i + 1) + ":");
            numerosj[i] = j.nextInt();
        }
        for (int numero : numerosj) {
            sumaj += numero;
        }
        System.out.println("El resultado de la suma es :"+sumaj);
        j.close();
}
}


