package Granja;

public class Tortuga extends Animal {

	public Tortuga(String nombre, int velocidad) {
		super(nombre,2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanzar() {	
		posicion+=velocidad;
		
	}

}
