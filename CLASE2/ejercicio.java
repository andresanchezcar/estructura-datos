import java.util.Scanner;

public class ejercicio {
   public static void main(String[] args) {
   int numero1;
   int numero2;
   Scanner x = new Scanner(System.in);
   System.out.println("Ingrese el primer digito:  ");
   numero1 = x.nextInt();
   System.out.println("Ingrese el primer digito:  ");
   numero2 = x.nextInt();
   int suma = numero1 + numero2;
   int resta = numero1 - numero2;
   int multiplicación  = numero1 * numero2;
   int division  = numero1 / numero2;

   System.out.println("La Suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
   System.out.println("La Resta de " + numero1 + " y " + numero2 + " es igual a " + resta);
   System.out.println("La Multiplicación de " + numero1 + " y " + numero2 + " es igual a " + multiplicación);
   System.out.println("La División de " + numero1 + " y " + numero2 + " es igual a " + division);

   } 
}
