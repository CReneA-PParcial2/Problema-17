/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg17;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULAR EL MAXIMO COMUN DIVISOR DE DOS NUMEROS
        int numero1, numero2;
        numero1 = solicitarNumero1();
        numero2 = solicitarNumero2();
        calcularMcd(numero1, numero2);
    }
    
    //ESCANEO DEL PRIMER NUMERO INGRESADO POR EL USUARIO
    public static int solicitarNumero1(){
        int numero1;
        System.out.println("Ingresa el primer numero:");
        Scanner entradaNumero1 = new Scanner(System.in);
        numero1 = entradaNumero1.nextInt();
        return numero1;
    }
    
    //ESCANEO DEL SEGUNDO NUMERO INGRESADO POR EL USUARIO
    public static int solicitarNumero2(){
        int numero2;
        System.out.println("Ingresa el segundo numero:");
        Scanner entradaNumero2 = new Scanner(System.in);
        numero2 = entradaNumero2.nextInt();
        return numero2;
    }
    
    //CALCULO E IMPRESION DEL RESULTADO YA CALCULADO
    public static void calcularMcd(int numero1, int numero2){
        int resultado;
        if(numero2==0){
            resultado = numero1;
        }else{
                resultado = numero1%numero2;
                }
        System.out.println("El Maximo Comun Divisor (MCD) es: " + resultado);
    }
}
