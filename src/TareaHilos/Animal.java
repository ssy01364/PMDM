package TareaHilos;

public class Animal extends Thread{
	String nombre="";
	int pausa;

	Animal(String n, int p){
		this.nombre=n;
		this.pausa=p;
	
		
	}
	
	public void run() {
		int c=0;
		while(c<=10) {
			System.out.println(this.nombre+" tiene posicion: "+c);
			System.out.println("--------");
			if(c==10) {
				System.out.println("");
				System.out.println(this.nombre+" Ha llegado a la meta.");
				System.out.println("");
			}
			
			try {
				Thread.sleep(this.pausa);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			c++;
		}
		
	}

}
