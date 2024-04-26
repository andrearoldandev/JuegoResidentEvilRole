package modelo;

public class PersonajeJugable extends PersonajesRE2 implements Objetos{
	//ATRIBUTO
	public int municion;
	public int spray;
	public String pistola;
	public String morirse;
	public String escopeta;
	
	public PersonajeJugable(String nombre) {
		super(nombre);
		municion = 0;
		spray = 0;
		pistola = "";
		morirse = "";
		escopeta = "";
	}
	
	//GETTERS Y SETTERS
	public int getMunicion() {
		return this.municion;
	}
	
	public String getPistola() {
		return this.pistola;
	}
	
	public int getSpray() {
		return this.spray;
	}
	
	public String getMorirse() {
		return this.morirse;
	}
	
	public String getEscopeta() {
		return this.escopeta;
	}
	
	public void setMunicion(int municion) {
		this.municion = municion;
	}
	
	public void setSpray(int spray) {
		this.spray = spray;
	}
	
	public void setPistola(String pistola) {
		this.pistola = pistola;
	}
	
	public void setMorirse(String morirse) {
		this.morirse = morirse;
	}
	
	public void setEscopeta(String escopeta) {
		this.escopeta = escopeta;
	}

	@Override
	public void pistola() {
		this.pistola = "\t- Usas la pistola y ¡DISPARAS A LA CABEZA!";
		
	}

	@Override
	public void escopeta() {
		this.escopeta = "\t- Usas la escopeta y ¡LE REVIENTAS LA SESERA!";
		
	}

	@Override
	public void spray(int numSpray) {
		this.spray += numSpray;
		System.out.println("\tTienes en el botiquín: ");
		
	}

	@Override
	public void municion(int numMunicion) {
		this.municion += numMunicion; 
		System.out.println("\tTu munición actual es: ");
		
	}

	@Override
	public void morirse() {
		this.morirse = "\t¡HAS MUERTO...! FIN DEL JUEGO";
		
	}
	
	

}	
