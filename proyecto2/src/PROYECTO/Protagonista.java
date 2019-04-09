package PROYECTO;

public class Protagonista extends Personaje {
	private int experienciaAct;
	private int experienciaMax;
	
public Protagonista(String pNombre){
	super (45, 100,4,99,1);
	super.setNombre(pNombre);
	
}

public void setAtributos(int pVida,int pVelocidad,int pExp,int pDanno){
	if(pVida>0){
		super.setVida(pVida + super.getVida());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu vida se ha incrementado en: "+pVida+ " Puntos");
	}
	else if(pVelocidad>0){
		super.setVel(pVelocidad+super.getVelocidad());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu velocidad se ha incrementado en: "+pVelocidad+ " Puntos");
	}
	else if(pExp>0){
		super.setExp(pExp+super.getExp());;
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu experiencia se ha incrementado en: "+pExp+ " Puntos");
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
	}
}

public int getExp(){
	return experienciaAct;
}

public int getNivel(){
	return super.getNivel();}

@Override
public void atacar(Personaje pEnemigo)
{
	// TODO Auto-generated method stub
	
}

public void defenderse(int pDen){
	setVida(getVida()-pDen);
}

public boolean comprobarVida(){
	boolean vida=super.comprobarVida();
	if(!vida){System.out.println("Has muerto en el combate");}
	return vida;
}


}
