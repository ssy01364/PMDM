package Granja;

public abstract class Animal {
	//atributos
	public String nombre;
	public int posicion;
	public int velocidad;
	
	public Animal(String nombre, int velocidad ) {
		this.nombre = nombre;
		this.velocidad=velocidad;
		this.posicion= 0;
		
	}
	
	//metodos
	public abstract void avanzar();

	
	//getters setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getPosicion() {
		return this.posicion;
		
	}
	
	public void setPosicion(int posicion) {
		this.posicion=posicion;
	}
	
	public int getVelocidad() {
		return velocidad;
		
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
	
	public boolean LlegoMeta() {
		return posicion >=100;
		
	}


	
	
	
	

}
