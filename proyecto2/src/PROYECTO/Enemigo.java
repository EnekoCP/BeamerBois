package PROYECTO;

import java.util.Random;

public class Enemigo extends Personaje {
	private int experienciaSoltada;

public Enemigo (int pVida,int pDanno, int pVel,int pExperienciaSoltada, String pNombre){
	super(100,35,3);
	super.setNombre(pNombre);
	super.setExp(pExperienciaSoltada);
	this.experienciaSoltada=pExperienciaSoltada;
	
	
}
private void SoltarExp(Protagonista pProtagonista){
	pProtagonista.setAtributos(0, 0, this.experienciaSoltada, 0);
}

	

public boolean comprobarVida(Protagonista pProtagonista){
	boolean vida=super.comprobarVida();
	if(!vida){
		System.out.println("El enemigo ha muerto");
		this.SoltarExp(pProtagonista);}
	return vida;
}

	

}
