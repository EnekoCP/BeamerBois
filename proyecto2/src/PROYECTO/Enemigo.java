package PROYECTO;



public class Enemigo extends Personaje {
	private int experienciaSoltada;

public Enemigo (int pVida,int pDanno,int pVel,int pExperienciaSoltada, String pNombre){
	super(pVida,pDanno,pDanno);
	super.setNombre(pNombre);
	super.setExp(pExperienciaSoltada);
	super.setVel(pVel);
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
