import java.util.Scanner;

public class Actividad1_1{

    public static boolean sabersiesprimo(int numj){
        if (numj <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numj); i++) {
            if (numj % i == 0) {
                return false;
            }
        }
    
        return true;
    }
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int numj;

        System.out.println("Ingresa un numero");
         numj = j.nextInt();
         if(sabersiesprimo(numj)){
            System.out.println("El numero "+numj+" es primo");


         }
         else{
            System.out.println("El numero "+numj+ " no es primo");
         }
         j.close();
    }
    
    }