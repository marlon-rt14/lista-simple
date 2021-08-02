package app;

public class Estudiante {

	private int ID;
	private String nombre;
	private String apellido;
	private int edad;
	Estudiante siguiente;

	public Estudiante(int id, String nombre, String apellido, int edad) {
		this.ID = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.siguiente = null;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estudiante getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}

}
