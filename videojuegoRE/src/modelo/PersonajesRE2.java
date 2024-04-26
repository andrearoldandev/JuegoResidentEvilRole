package modelo;

public abstract class PersonajesRE2 {
	private String nombre;
	
	//CONSTRUCTOR
	public PersonajesRE2(String nombre) {
		this.nombre = nombre;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODO
	public abstract void morirse();
}
