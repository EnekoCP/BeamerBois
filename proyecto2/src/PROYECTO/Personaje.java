package PROYECTO;

abstract class Personaje  {
	private String nombre;
	private int vida;
	private int danno;
	private int vel;
	private int nivel;
	private int exp;

	
public Personaje (int pVida, int pDanno, int pVel,int pExp,int pNivel ){
	vida=pVida;
	danno=pDanno;
	vel=pVel;
	exp =pExp;
	nivel=pNivel;
}
protected  void atacar(Personaje pPersonajeRival){
	this.vida=pPersonajeRival.danno;
		
}



public boolean comprobarVida(){
	return (this.vida<=0);
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
	this.vida=pVida;
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





}
