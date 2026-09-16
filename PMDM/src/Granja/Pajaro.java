package Granja;


public class Pajaro extends Animal {

	public Pajaro(String nombre,int velocidad) {
		super(nombre,0);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void avanzar() {
		double accion = Math.random();
		
		if(accion<0.5) {
			posicion+=3;
		}else {
			posicion+=10;
		}
		
	}
	

}
