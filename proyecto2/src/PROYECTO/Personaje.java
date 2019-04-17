package PROYECTO;

abstract class Personaje  {
	private String nombre;
	private int vida;
	private int danno;
	private int vel;
	private int nivel;
	private int exp;
	private int posicion=0;

	
public Personaje (int pVida, int pDanno, int pVel){
	vida=pVida;
	danno=pDanno;
	vel=pVel;
	exp =0;
	nivel=1;
}
protected void atacar(Personaje pEne)
{   
	pEne.setVida(getDanno());
	imprimirInfoPersonaje();
	pEne.imprimirInfoPersonaje();
	
	
}

public boolean comprobarVida(){
	return (this.vida>=0);
}
public int getVelocidad(){
	return vel;
}

protected int getNivel(){
	return vel;
}
protected int getDanno(){
	return danno;
}
protected int getVida(){
	return vida;
}

protected String getNombre(){
	return nombre;
}

protected int getExp(){
	return exp;
}


protected void setNombre(String pNombre){
	this.nombre=pNombre;
}

protected void setVida(int pVida){
	this.vida=(vida-pVida);
}
protected void setMuerte(int pVida){
	this.vida=pVida;
}
protected void decrincremetoVida(int pVida){
	this.vida=(vida+pVida);
}

protected void setDanno(int pDanno){
	this.danno=pDanno;
}

protected void setVel(int pVel){
	this.vel=pVel;
}
protected void setExp(int pExp){
	this.exp=pExp;
}

protected void setNivel(int pNivel){
	this.nivel=pNivel;
}


public void imprimirInfoPersonaje(){
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Status Vida de:" +nombre+"                           Danno: "+danno);
	System.out.println("Vida: "+vida+"                                        Exp: "+exp);
	System.out.println("Velocidad: "+vel+"                                        Nivel: "+nivel);
	System.out.println("----------------------------------------------------------------------------------");
	
}




}
