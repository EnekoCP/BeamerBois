package PROYECTO;

public class Protagonista extends Personaje {
	private int experienciaAct;
	private int experienciaMax;
	
public Protagonista(String pNombre){
	super (100, 45,5);
	super.setNombre(pNombre);
	
}

public void setAtributos(int pVida,int pVelocidad,int pExp,int pDanno){
	if(pVida!=0){
		super.decrincremetoVida(pVida);
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu vida se ha incrementado en: "+pVida+ " Puntos");
	}
	else if(pVelocidad>0){
		super.setVel(pVelocidad+super.getVelocidad());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu velocidad se ha incrementado en: "+pVelocidad+ " Puntos");
	}
	else if(pExp>0){
		super.setExp(pExp+super.getExp());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu experiencia se ha incrementado en: "+pExp+ " Puntos");
		this.subirNivel();
	}
	else{
		super.setDanno(pDanno+super.getDanno());;
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu danno se ha incrementado en: "+pDanno+ " Puntos");
		
	}
}

private void subirNivel(){
	if (this.getExp()>=this.getNivel()*100){
		this.setNivel(this.getNivel()+1);
		System.out.println("Has subido de NIVEL !!!");
	}
}

public int getExp(){
	return experienciaAct;
}

public int getNivel(){
	return super.getNivel();}



public void defenderse(int pDen){
	setVida(getVida()-pDen);
}

public boolean comprobarVida(){
	boolean vida=super.comprobarVida();
	if(!vida){System.out.println("Has muerto en el combate");}
	return vida;
}


}
