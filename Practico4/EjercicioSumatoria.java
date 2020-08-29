package Practico3;

import java.util.Scanner;

public class EjercicioSumatoria {

    //Pedir el ingreso de numeros hasta ingresar un 0
    //Calcular la suma
    //Calcular el promedio
    //Utilizar metodos...

    public static void main (String args[]) {
        int suma = 0;
        int contador = 0;

        Scanner input = new Scanner( System.in);

        int num = pedirNumero(input);

        while (num != 0) {
            suma = sumar(suma, num);
            contador ++;
            num = pedirNumero(input);
        }

        float promedio = calcularPromedio(suma, contador);
        System.out.println("El promedio es " + promedio);
    }

    public static int sumar(int suma, int numero) {
        return suma + numero;
    }

    public static int pedirNumero(Scanner input){
        System.out.println("Porfavor, ingrese otro numero");
        int num = input.nextInt();
        return num;
    }

    public static float calcularPromedio(int sumatoria, int contador) {
        return sumatoria / contador;
    }



}
