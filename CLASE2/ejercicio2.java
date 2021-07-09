import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        String nombre = Sc.nextLine();

        System.out.println("Ingrese la primera nota del alumno: ");
        double Nota1 = Sc.nextDouble();
     
        System.out.println("Ingrese la segunda nota del alumno: ");
        double Nota2 = Sc.nextDouble();

        System.out.println("Ingrese la tercera nota del alumno: ");
        double Nota3 = Sc.nextDouble();

        double promedio = (Nota1 + Nota2 + Nota3)/3;

        if (promedio >= 3.0 ) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
        Sc.close();
    }  
}