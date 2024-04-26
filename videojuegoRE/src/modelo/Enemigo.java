package modelo;

public class Enemigo extends PersonajesRE2 implements Ataques{
	public String mordisco;
	public String ataqueTyrant;
	
	public Enemigo(String nombre) {
		super(nombre);
		mordisco = "TE HAN MORDIDO";
		ataqueTyrant = "TE HAN ARRANCADO LA CABEZA";
	}
	
	//GETTERS Y SETTERS
	public String getMordisco() {
		return this.mordisco;
	}
	
	public String getAtaqueTyrant() {
		return this.ataqueTyrant;
	}
	
	public void setMordisco(String mordisco) {
		this.mordisco = mordisco;
	}
	
	public void setAtaqueTyrant(String ataqueTyrant) {
		this.ataqueTyrant = ataqueTyrant;
	}
	
	@Override
	public void mordisco() {
		this.mordisco = "\tLa herida es muy grave y te han contagiado, morirás pronto";
		
	}


	@Override
	public void morirse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ataqueTyrant() {
		this.ataqueTyrant = "\tTe han arrancado la cabeza, no se que esperas que pase...";
		
	}
}
