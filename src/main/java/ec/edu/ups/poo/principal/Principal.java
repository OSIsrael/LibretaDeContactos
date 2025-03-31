package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Principal {
    //El código funciona de manera correcta
    // Commit de Einar Kaalhus a Orellana Israel
    //Transfomración
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona personita = new Persona();
        personita.setCedula("123456789");
        personita.setNombre("Juan");
        personita.setApellido("Perez");
        personita.setDireccion("Por ahi");

        System.out.print("¿Cuántas personas quieres ingresar?: ");
        int numeroDePersonas = leer.nextInt();
        Persona[] personas = new Persona[numeroDePersonas];

        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("\nIngresando datos de la persona " + (i + 1));
            System.out.print("Ingrese la cédula: ");
            String cedula = leer.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = leer.next();
            System.out.print("Ingrese la dirección: ");
            String direccion = leer.next();

            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        System.out.print("\n¿Cuántos familiares deseas ingresar?: ");
        int numeroDeFamiliares = leer.nextInt();
        Familiar[] familiares = new Familiar[numeroDeFamiliares];

        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("\nIngresando datos del familiar " + (i + 1));
            System.out.print("Ingrese la cédula: ");
            String cedula = leer.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = leer.next();
            System.out.print("Ingrese la dirección: ");
            String direccion = leer.next();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = leer.next();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoDeSangre = leer.next();
            System.out.print("Ingrese el año de nacimiento: ");
            int anio = leer.nextInt();
            System.out.print("Ingrese el mes de nacimiento (1-12): ");
            int mes = leer.nextInt() - 1;
            System.out.print("Ingrese el día de nacimiento: ");
            int dia = leer.nextInt();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoDeSangre, fechaNacimiento);
        }

        System.out.println("\n--- LISTA DE PERSONAS ---");
        for (Persona p : personas) {
            System.out.println(p);
            System.out.println("------------------------");
        }

        System.out.println("\n--- LISTA DE FAMILIARES ---");
        for (Familiar f : familiares) {
            System.out.println(f);
            System.out.println("------------------------");
        }

        leer.close();
    }
}
