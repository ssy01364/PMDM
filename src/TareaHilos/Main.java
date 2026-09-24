package TareaHilos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal Tortuga=new Animal("Tortuga", 600);
		Animal Liebre=new Animal("Liebre",200);
		Animal Pajaro=new Animal("Pajaro",350);
		
		Tortuga.start();
		Liebre.start();
		Pajaro.start();
		
		

	}

}
