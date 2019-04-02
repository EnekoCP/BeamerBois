package PROYECTO;

abstract class Personaje  {
	private String nombre;
	private int vida;
	private int danno;
	private int vel;
	private int nivel;

	
public Personaje (int pVida, int pDanno, int pVel,int pNivel ){
	vida=pVida;
	danno=pDanno;
	vel=pVel;
	nivel=pNivel;
}
public void atacar(Personaje pPersonaje){}



public boolean comprobarVida(){
	return (this.vida<=0);
}
public int getVelocidad(){
	return vel;
}

protected int getNivel(){
	return vel;
}


protected void setNombre(String pNombre){
	this.nombre=pNombre;
}

protected void setVida(int pVida){
	//this.nombre=pNombre;
}

protected void setDanno(int pDanno){
	//this.nombre=pNombre;
}

protected void setVel(int pVel){
	//this.nombre=pNombre;
}

protected void setNivel(int pNivel){
	//this.nombre=pNombre;
}





}
