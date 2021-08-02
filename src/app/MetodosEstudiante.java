package app;

public class MetodosEstudiante {

	private Estudiante estudiante;
	private int contador;

	public MetodosEstudiante() {
		estudiante = null;
		contador = 1;
	}

	private boolean estaVacia(Estudiante lista) {
		if (lista == null) {
			return true;
		} else {
			return false;
		}
	}

	public void nuevoEstudiante(String nombre, String apellido, int edad) {
		Estudiante nuevo = new Estudiante(contador, nombre, apellido, edad);
		if (estaVacia(estudiante)) {
			estudiante = nuevo;
			contador++;
		} else {
			Estudiante actual = estudiante;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}

			actual.setSiguiente(nuevo);
			contador++;
		}
	}

	public void actualizarEstudiante(int id, String nombre, String apellido, int edad) {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			if (actual.getID() == id) {
				actual.setNombre(nombre);
				actual.setApellido(apellido);
				actual.setEdad(edad);
				break;
			} else {
				actual = actual.getSiguiente();
			}
		}
	}

	public void eliminarEstudiante(int id) {
		
		if (estudiante.getID() == id) {
			estudiante = estudiante.getSiguiente();
		}else {
			Estudiante actual = estudiante;
			while(!estaVacia(actual)){
				if (actual.getSiguiente().getID() == id) {
					Estudiante continuacion = actual.getSiguiente().getSiguiente();
					actual.setSiguiente(continuacion);
					System.out.println("Estudiante eliminado!. \n");
					break;
				}else{
					actual = actual.getSiguiente();
				}
			}
		}
		
		
		
//		Estudiante actual = estudiante;
//		while (!estaVacia(actual)) {
//			if (actual.getID() == id) {
//				estudiante = estudiante.getSiguiente();
//				break;
//			} else if (actual.getSiguiente().getID() == id) {
//				Estudiante continuacion = actual.getSiguiente().getSiguiente();
//				actual.setSiguiente(continuacion);
//				System.out.println("Estudiante eliminado!. \n");
//			} else {
//				actual = actual.getSiguiente();
//			}
//		}
	}

	public void imprimirEstudiantes() {
		Estudiante actual = estudiante;
		while (!estaVacia(actual)) {
			System.out.println(actual.getID());
			System.out.println(actual.getNombre());
			System.out.println(actual.getApellido());
			System.out.println(actual.getEdad());
			System.out.println("_________________________________\n");
			actual = actual.getSiguiente();
		}
	}

}
