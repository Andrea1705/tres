/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              
/*
Solicitar al usuario que ingrese 3 números.
Luego informar:
La suma de los dos primeros
La resta de los dos segundos
El resto entre el primer número y el segundo
La suma total
El promedio
*/
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Por favor, ingrese un número y presione enter:");
        int num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro número y presione enter:");
        int num2 = teclado.nextInt();
        
        System.out.println("Ingrese un tercer número y presione enter:");
        int num3 = teclado.nextInt();
        
        
        int suma = num1 + num2;
        System.out.println("La suma de los dos primeros es: " + suma);
        
        int resta = num2 - num3;
        System.out.println("La resta ente el segundo y el tercero es: " + resta);
        
        int resto = num1 % num2;
        System.out.println("El resto entre el primero y el segundo es: " + resto); 
        
        int total = num1 + num2 + num3;
        System.out.println("La suma de todos los números es: " + total);
        
        double promedio = total / 3;
        System.out.println("El promedio de los tres número es: " + promedio);
       

/*
Solicitar al usario que ingrese dos números.
Devolver el primer número aumentado en 17
y el segundo número decrementado en 10
*/
   
        Scanner tecla = new Scanner(System.in);
        
        
        System.out.println("Para sumar 17 a un número, primero ingrese un número entero: ");
        int num4 = tecla.nextInt();
        
        num4 += 17;
        System.out.println("El número incrementado es: " + num4);
        
        
        System.out.println("Para restar 10 a un número, primero ingrese un número entero: ");
        long num5 = tecla.nextInt();
        
        num5 -= 10L;
        System.out.println("El número decrementado en 10 es: " + num5);
        
        
/*
Solicitar al usuario que ingrese la base y la altura de un rectángulo e informar:
El área del rectángulo
El perímetro del rectángulo.
*/
      
        Scanner teclas = new Scanner(System.in);
        
        
        System.out.println("Para calcular el área de un rectángulo por favor ingrese su base: ");
        int num6 = teclas.nextInt();
        
        System.out.println("Ahora, ingrese su altura: ");
        int num7 = teclas.nextInt();
        
        int area = num6 * num7;
        System.out.println("El área de un rectangulo es: " + area);
        
        
        System.out.println("Para calcular el perímetro de un rectángulo por favor ingrese su largo: ");
        int num8 = teclas.nextInt();
        
        System.out.println("Ahora, ingrese su ancho: ");
        int num9 = teclas.nextInt();
        
        int perimetro = 2 * (num8 + num9);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        
        
        
    }
    
}
