package Practico3;

import java.util.Scanner;

public class EjerciciosP3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = input.nextInt();


        System.out.println("Ingrese otro número");
        int num2 = input.nextInt();

       // System.out.println("El valor absoluto es: " + valorAbsoluto(num));

    }

    public static int calcularSuma (int num1, int num2){
        return num1 + num2;
    }

    public static int calcularResta (int num1, int num2){
        return num1 + num2;
    }

    public static int calcularMultiplicacion (int num1, int num2){
        return num1 + num2;
    }

    public static int calcularDivision (int num1, int num2){
        if ( num2 != 0 ){
            return num1 / num2;
        } else {
            return 0;
        }
    }
}





