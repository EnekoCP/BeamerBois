package PROYECTO;

public class Protagonista extends Personaje {
	
public Protagonista(String pNombre){
	super (300, 45,5);
	super.setNombre(pNombre);
	
}

public void setAtributos(int pVida,int pVelocidad,int pExp,int pDanno){
	if(pVida>0){
		super.incremetoVida(pVida);
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu vida se ha incrementado en: "+pVida+ " Puntos");
	}
	if(pVelocidad>0){
		super.setVel(pVelocidad+super.getVelocidad());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu velocidad se ha incrementado en: "+pVelocidad+ " Puntos");
	}
	 if(pExp>0){
		super.setExp(pExp+super.getExp());
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu experiencia se ha incrementado en: "+pExp+ " Puntos");
		subirNivel();
	}
	 if(pDanno>0){
		super.setDanno(pDanno+super.getDanno());;
		System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
		System.out.println("Tu danno se ha incrementado en: "+pDanno+ " Puntos");
		
	}
	 if(pDanno<0){
			super.setDanno(pDanno+super.getDanno());;
			System.out.println("¡Enhorabuena, "+super.getNombre()+"!");
			System.out.println("Tu danno se ha decrementado en: "+pDanno+ " Puntos");
			
		}
	 if(pExp<0){
			super.setExp(pExp+super.getExp());
			System.out.println("¡UPS, "+super.getNombre()+"!");
			System.out.println("Tu experiencia se ha decrementado en: "+pExp+ " Puntos");
			subirNivel();
		}
	 if(pVelocidad<0){
			super.setVel(pVelocidad+super.getVelocidad());
			System.out.println("¡UPS, "+super.getNombre()+"!");
			System.out.println("Tu velocidad se ha decrementado en: "+pVelocidad+ " Puntos");
		}
	 if(pVida<0){
		super.incremetoVida(pVida);
		System.out.println("¡UPS, "+super.getNombre()+"!");
		System.out.println("Tu vida se ha decrementado en: "+pVida+ " Puntos");
	}
}

public void subirNivel(){
	//if (this.getExp()>=this.getNivel()*100){
	//	this.setNivel(this.getNivel()+1);
	//	System.out.println("Has subido de NIVEL !!!");
	//}
	
	if(super.getNivel()==1 && super.getExp()>=50){
		System.out.println("Has subido de NIVEL !!!");
		this.setNivel(this.getNivel()+1);
		super.setDanno(getDanno()+10); super.setExp(0);
		super.setVel(super.getVelocidad()+1);
		super.incremetoVida(150);
	}
	else if(super.getNivel()==2 && super.getExp()>=100){
		System.out.println("Has subido de NIVEL !!!");
		this.setNivel(this.getNivel()+1);
		super.setDanno(getDanno()+30); super.setExp(0);
		super.setVel(super.getVelocidad()+3);
		super.incremetoVida(250);
	}
	
	else if(super.getNivel()>=3 && super.getExp()>=150){
		System.out.println("Has subido de NIVEL !!!");
		this.setNivel(this.getNivel()+1);
		super.setDanno(getDanno()+50); super.setExp(0);
		super.setVel(super.getVelocidad()+3);
		super.incremetoVida(300);
	}
	
}


public boolean comprobarVida() throws ProtaHaMuertoExcepcion{
	boolean vida=super.comprobarVida();
	//this.subirNivel();
	if(!vida){System.out.println("Has muerto en el combate");
	throw(new ProtaHaMuertoExcepcion());} else{subirNivel();}
	return vida;
}


}
