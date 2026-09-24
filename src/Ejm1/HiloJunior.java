package Ejm1;

public class HiloJunior extends Thread{
	String nombre="";
	int pausa;
	HiloJunior(String n,int p){
		this.nombre= n;
		this.pausa= p;
		
	}
	public void run() {
		int c=0;
		while(c<1000) {
			System.out.println("numero de ejecuccion del hilo "+this.nombre+ ": "+c);
			
			try {
				Thread.sleep(this.pausa);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			c++;
		}
	}
}
