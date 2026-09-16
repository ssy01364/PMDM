package Granja;

public class Liebre extends Animal {

	public Liebre(String nombre, int velocidad) {
		super(nombre, 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanzar() {
		double probabilidad = Math.random();
		
		if(probabilidad<0.25) {
			return;
		}
		posicion+=velocidad;
		
	}

	

}
