import java.util.Scanner;

public class Actividad1_2 {
    public static int mcd(int num1j, int num2j) {

        while (num2j != 0) {
            int guardarnum2j = num2j;
            num2j = num1j % num2j;
            num1j = guardarnum2j;
        }
        return num1j;
    }
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int num1j, num2j,reslutadodemcd;


        System.out.println("Ingresa un numero");
        num1j = j.nextInt();

        System.out.println("Ingresa un segundo numero");
        num2j = j.nextInt();

        reslutadodemcd = mcd(num1j, num2j);
        System.out.println("el MCD de los numeros "+num1j+" "+num2j+" es " + reslutadodemcd);

        j.close();
    }
}
