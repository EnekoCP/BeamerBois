package PROYECTO;

import java.util.Random;

public class Enemigo extends Personaje {
	private int experienciaSoltada;
	private String nombre;

public Enemigo (int pExperienciaSoltada, String pNombre){
	super(5, 100,4,99,1);
	this.nombre=pNombre;
	this.experienciaSoltada=super.getExp();
	
}
private void SoltarExp(Protagonista pProtagonista){
	pProtagonista.setAtributos(0, 0, this.experienciaSoltada, 0);
}

	

public boolean comprobarVida(){
	boolean vida=super.comprobarVida();
	if(!vida){System.out.println("El enemigo ha muerto");}
	return vida;
}

	

}
