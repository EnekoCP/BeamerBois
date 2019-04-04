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
	if(pVida>0){
		super.setVida(pVida);
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu vida se ha incrementado en: "+pVida+ " Puntos");
	}
	else if(pVelocidad>0){}
	else if(pExp>0){}
	else{
		
	}
}


public int getExp(){
	return experienciaAct;
}

public int getNivel(){return super.getNivel();}


}
