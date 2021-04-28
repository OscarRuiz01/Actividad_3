/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_3;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class Actividad_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lista = new Scanner(System.in);
        
        System.out.println("***************************************************");
        System.out.println("************         WELCOME           ************");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Escoge un número que se encuetre en la siguiente lista : ");
        System.out.println("");
        System.out.println("Suma del 0 al 10.--------------------------------[1]");
        System.out.println("Factorial del 1 al 10.---------------------------[2]");
        System.out.println("Factorial que sea introducido por un usuario.----[3]");
        System.out.println("Media del 0 hasta el número introducido.---------[4]");
        System.out.println("Promedio de dos números introducidos.------------[5]");
        System.out.println("Arreglo de días de la semana.--------------------[6]");
        System.out.println("Modelo que estructure el juego Gato.-------------[7]");
        System.out.println("");
        System.out.print("Escoja alguna opción de las antes mencionadas: ");

        principal(lista.nextInt());

    }
    public static void principal(int numero){
        
        Scanner lista = new Scanner(System.in);
        int numeroE = numero;
        switch(numeroE){
            case 1:
                System.out.println("");
                System.out.println("********************************************");
                System.out.println("**********    Suma del 1 al 10    **********");
                System.out.println("********************************************");
                System.out.println("");
                suma_1();
                break;
            case 2:
                System.out.println("");
                System.out.println("********************************************");
                System.out.println("**********    Factorial del 10    **********");
                System.out.println("********************************************");
                System.out.println("");
                factorial_2();
                break;
            case 3:
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("**********        Factorial        **********");
                System.out.println("*********************************************");
                System.out.println("");
                System.out.print("Introduce un número para calcular el factorial: ");
                Factorial_3(lista.nextInt());
                break;
            case 4:
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("**********          Media          **********");
                System.out.println("*********************************************");
                System.out.println("");
                System.out.print("Introduce un número para calcular la media: ");
                media_4(lista.nextDouble());
                break;
            case 5:
                System.out.println("");
                System.out.println("********************************************");
                System.out.println("**********        Promedio        **********");
                System.out.println("********************************************");
                System.out.println("");
                System.out.print("Introduce la cantidad de números que deseas introducir: ");
                sumaPromedio_5(lista.nextInt());
                break;
            case 6:
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("**********    Dias de la semana    **********");
                System.out.println("*********************************************");
                System.out.println("");
                diaSemana_6();
                break;
            case 7:
                System.out.println("");
                System.out.println("********************************************");
                System.out.println("**********     Juego de Gato      **********");
                System.out.println("********************************************");
                System.out.println("");
                gato_7();
                break;        
        }
        
    }
    public static void suma_1(){
        int suma = 0;
        for (int i = 1; i <= 10; i++) {  
            suma += i;
        }
        System.out.println("La suma del 1 hasta el 10 es de: " + suma);
    }
    public static void factorial_2(){
        int factorial = 1;
        for (int i = 10; i >= 1; i--) {   
            factorial *= i;   
        }
        System.out.println("El factorial de 10 es: " + factorial);
    }
    public static void Factorial_3(int numeroE){ 
        int numero = numeroE;
        int factorial = 1;
        for (int i = numero; i >= 1; i--) {    
            factorial *= i;  
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    public static void media_4(double numeroE){
        double numeroI = numeroE;
        double suma = 0;
       
        for (int i = 1; i <= numeroI; i++) {   
            suma += i;  
        }
        double media = suma / numeroI;
        System.out.println("La media de los numeros que estan entre el 0 y " + numeroI + " es " + media);
    }
    public static void sumaPromedio_5(int numeroI){
         
        Scanner entrada = new Scanner(System.in);
        
        int numero = numeroI;
        int suma = 0;
        double promedio;
        int diferencia;
        
        int arrays[] = new int[numero];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            arrays[i] = entrada.nextInt();
        }
        
        int mayor, menor;
        mayor = menor = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] > mayor){
                mayor = arrays[i];
            } else if(arrays[i] < menor){
                menor = arrays[i];
            }
            suma += arrays[i];
        }
        promedio = (double)suma / (double)numero;
        diferencia = mayor - menor;
        System.out.println("La cantidad de numeros introducidos fueron : " + numero);
        System.out.println("El promedio de los numeros introducidos es de: " + promedio);
        System.out.println("El numero mayor introducido fue: " + mayor);
        System.out.println("El numero menor introducido fue: " + menor);
        System.out.println("La diferencia del numero mayor y menor es de: " + diferencia);
    }
    
    public static void diaSemana_6(){
        String dia[] = new String[7];
        dia[0] = "Lunes";
        dia[1] = "Martes";
        dia[2] = "Miercoles";
        dia[3] = "Jueves";
        dia[4] = "Viernes";
        dia[5] = "Sabado";
        dia[6] = "Domingo";
        for(String diaS: dia){ 
            System.out.println(diaS); 
        }
        
    }
    
    public static void gato_7(){ 
        String gato[][] = new String[3][3];
        
        for(String vertical[]: gato){
            for(String horizontal: vertical){
                System.out.print("+" + " ");
            }
            System.out.println("");
        }
        
    }
    
}
