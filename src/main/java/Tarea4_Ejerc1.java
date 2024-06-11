/**
 * Clase Tarea4_Ejerc1, que imprime la tabla de multiplicar de un número menor que 30.
 * Para ello se utilizan los bucles for, while y do-while.
 * 
 * @author Marta Escudero
 */

import java.util.Scanner;

public class Tarea4_Ejerc1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
//pedimos el número al usuario

        System.out.println("Indica un número menor que 30");
        int numero = teclado.nextInt();
        
//mostrar error si el número es mayor o igual a 30
if (numero >= 30) {
    System.out.println ("El número debe ser menor que 30.");
    return; //salimos del método
}
//bucle for
int i = 1;
for (i=1; i <= 10; i++) {
     System.out.println(numero + " x " + i +  " = " + (numero*i));
}
System.out.println ("----------");
      
//bucle while
i=1;
while (i<=10){
     System.out.println(numero + " x " + i +  " = " + (numero*i));
     i++;
}

System.out.println ("----------");
//bucle do-while
i=1;
do {
    System.out.println(numero + " x " + i +  " = " + (numero*i));
    i++;
     }
while (i<=10);
    }
}
