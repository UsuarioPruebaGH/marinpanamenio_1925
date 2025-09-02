/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marinpanamenio_1925;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Marinpanamenio_1925 {

    public static void main(String[] args) {
        matriz();
    }
    public static void matriz() {
        
        Scanner scanner = new Scanner(System.in); //LECTURA DE TECLADO
        
        int [][] matriz = new int [3][3];
        int suma = 0;
        int total_elementos = 0;
        double promedio = 0d;
        
        System.out.println("Ingrese una matriz de 3x3");
        
        for (int i = 0; i <matriz.length; i++)
        {
            total_elementos += matriz[i].length;
            for (int j = 0;  j < matriz[i].length; i++)
            {
                System.out.println("Elemento [" +i+ "][" +j+"]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz ingresada: ");
        
        for (int x = 0; x < matriz.length; x++){
            for (int  y = 0; y <matriz[x].length; y++){
                
                System.out.println(matriz[x][y]+ " ");
                
                suma += matriz[x][y];
            }
            System.out.println();
        }
        promedio = (double)suma/total_elementos;
        System.out.println(suma+" es la sumatoria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
        System.out.println("El promedio de edad es: "+promedio);
        scanner.close();
    }
}