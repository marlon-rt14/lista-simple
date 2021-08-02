
package app;

import java.util.Scanner;


public class prueba {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
	MetodosEstudiante estudiante = new MetodosEstudiante();
	
	String nombre = "", apellido = "";
	int id = 0, edad = 0;
        
        int op = 0;
        
        System.out.println("CREAR UNA LISTA SIMPLE: ");
        System.out.println("");
        
        do {
            System.out.println("SELECCIONE UNA OPCION DEL MENU: ");
            System.out.println("1.- Agregar\n2.- Acutalizar\n3.- Eliminar\n4.- Imprimir\n5.- Salir");
            op = dato.nextInt();
            System.out.println("");
            switch(op) {
                case 1: 
			System.out.print("Nombre: ");
			nombre = dato.next();
			System.out.print("Apellido: ");
			apellido = dato.next();
			System.out.print("Edad: ");
			edad = dato.nextInt();
			System.out.println("");
			estudiante.nuevoEstudiante(nombre, apellido, edad);
                    break;
                case 2: 
			System.out.print("ID: ");
			id = dato.nextInt();
			System.out.print("Nombre: ");
			nombre = dato.next();
			System.out.print("Apellido: ");
			apellido = dato.next();
			System.out.print("Edad: ");
			edad = dato.nextInt();
			System.out.println("");
			estudiante.actualizarEstudiante(id, nombre, apellido, edad);
                    break;
                case 3:
			System.out.println("ID: ");
			id = dato.nextInt();
			estudiante.eliminarEstudiante(id);
                    break;
                case 4:
			estudiante.imprimirEstudiantes();
                    break;
                case 5: 
                    break;
            }
        } while (op != 5);
        
        
    }
    
}
