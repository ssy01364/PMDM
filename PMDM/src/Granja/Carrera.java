package Granja;

import java.util.ArrayList;

public class Carrera {
	
	    public static void main(String[] args) {
	        ArrayList<Animal> participantes = new ArrayList<>();
	        
			participantes.add(new Tortuga("Tortuga",0));
	        participantes.add(new Liebre("Liebre", 0));
	        participantes.add(new Pajaro("Pajaro", 0));

	        boolean carreraTerminada = false;

	        while (!carreraTerminada) {
	            for (Animal animal : participantes) {
	                animal.avanzar();

	                System.out.println(animal.getNombre() + " está en: " + animal.getPosicion() + " m");
	            }

	            System.out.println("---------------------");

	            for (Animal animal : participantes) {
	                if (animal.LlegoMeta()) {
	                    System.out.println("Ganador: " + animal.getNombre());
	                    carreraTerminada = true;
	                    break;
	                }
	            }
	        }
	    }
	}


