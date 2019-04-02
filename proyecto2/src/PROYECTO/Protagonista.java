package PROYECTO;

public class Protagonista extends Personaje {
	private int experienciaAct;
	private int experienciaMax;
	
public Protagonista(String pNombre){
	super (45, 100,4,1);
	super.setNombre(pNombre);
	
}

private void subirNivel(){
	
}

public void setAtributos(int pVida,int pVelocidad,int pExp,int pDano){
}


public int getExp(){
	return experienciaAct;
}

public int getNivel(){return super.getNivel();}


}
