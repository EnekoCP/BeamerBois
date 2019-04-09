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
@Override
public void atacar(Personaje pProtagonista)
{
	// TODO Auto-generated method stub
	
}

	

}
